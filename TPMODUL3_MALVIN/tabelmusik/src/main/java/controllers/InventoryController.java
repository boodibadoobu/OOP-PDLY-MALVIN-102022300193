package controllers;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import models.Album;

public class InventoryController {

    @FXML
    private TableView<Album> albumTableData;

    @FXML
    private TableColumn<Album, String> NamaAlbumColumn;

    @FXML
    private TableColumn<Album, String> artistColumn;

    @FXML
    private TableColumn<Album, Integer> availableColumn;

    @FXML
    private TableColumn<Album, Integer> totalColumn;

    @FXML
    private TextField tfNamaAlbum;

    @FXML
    private TextField tfArtist;

    @FXML
    private TextField tfTotal;

    @FXML
    private TextField tfRented;

    private final ObservableList<Album> albumList = FXCollections.observableArrayList();

    private Album selectedAlbum = null;

    public void initialize() {
        NamaAlbumColumn.setCellValueFactory(new PropertyValueFactory<>("NamaAlbum"));
        artistColumn.setCellValueFactory(new PropertyValueFactory<>("artist"));
        availableColumn.setCellValueFactory(new PropertyValueFactory<>("available"));
        totalColumn.setCellValueFactory(new PropertyValueFactory<>("total"));

        albumTableData.setItems(albumList);

        albumTableData.setOnMouseClicked(event -> {
            if (event.getClickCount() == 2) {
                Album selectedAlbum = albumTableData.getSelectionModel().getSelectedItem();
                if (selectedAlbum != null) {
                    populateFields(selectedAlbum);
                }
            }
        });
    }


    @FXML
    void AddFunction(MouseEvent event) throws IOException {
        String NamaAlbum = tfNamaAlbum.getText();
        String artist = tfArtist.getText();
        String totalText = tfTotal.getText();
        String rentedText = tfRented.getText();

        if (NamaAlbum.isEmpty() || artist.isEmpty() || totalText.isEmpty() || rentedText.isEmpty()) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Input Validation Error");
            alert.setContentText("Field tidak boleh kosong !");
            alert.showAndWait();
            return;
        }

        if (isNamaAlbumExists(NamaAlbum)) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Duplicate Album Name");
            alert.setContentText("Album sudah ada !");
            alert.showAndWait();
            return;
        }

        try {
            int total = Integer.parseInt(totalText);
            int rented = Integer.parseInt(rentedText);

            if (rented > total) {
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText("Invalid Input");
                alert.setContentText("Rented tidak bisa melebihi Total !");
                alert.showAndWait();
                return;
            }

            int available = total - rented;

            Album newAlbum = new Album(NamaAlbum, artist, available, rented, total);
            albumList.add(newAlbum);

            Alert successAlert = new Alert(AlertType.INFORMATION);
            successAlert.setTitle("Success");
            successAlert.setHeaderText(null);
            successAlert.setContentText("Album berhasil dibuat !");
            successAlert.showAndWait();

            clearData();
        } catch (NumberFormatException e) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Invalid Input");
            alert.setContentText("Total dan Rented harus berupa angka !");
            alert.showAndWait();
        }
    }

    @FXML
    void UpdateFunction(MouseEvent event) throws IOException {
        if (selectedAlbum == null) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Tidak ada album terpilih");
            alert.setContentText("Pilih data yang ingin diubah terlebih dahulu !.");
            alert.showAndWait();
            return;
        }

        String NamaAlbum = tfNamaAlbum.getText();
        String artist = tfArtist.getText();
        String totalText = tfTotal.getText();
        String rentedText = tfRented.getText();

        if (NamaAlbum.isEmpty() || artist.isEmpty() || totalText.isEmpty() || rentedText.isEmpty()) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Input Validation Error");
            alert.setContentText("Field tidak boleh kosong !");
            alert.showAndWait();
            return;
        }

        if (!selectedAlbum.getNamaAlbum().equalsIgnoreCase(NamaAlbum) && isNamaAlbumExists(NamaAlbum)) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Duplicate Album Name");
            alert.setContentText("An album with this name already exists!");
            alert.showAndWait();
            return;
        }

        try {
            int total = Integer.parseInt(totalText);
            int rented = Integer.parseInt(rentedText);

            if (rented > total) {
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText("Invalid Input");
                alert.setContentText("Rented cannot exceed Total.");
                alert.showAndWait();
                return;
            }

            int available = total - rented;

            selectedAlbum.setNamaAlbum(NamaAlbum);
            selectedAlbum.setArtist(artist);
            selectedAlbum.setTotal(total);
            selectedAlbum.setAvailable(available);

            albumTableData.refresh();

            Alert successAlert = new Alert(AlertType.INFORMATION);
            successAlert.setTitle("Success");
            successAlert.setHeaderText(null);
            successAlert.setContentText("Album successfully updated!");
            successAlert.showAndWait();

            clearData();
            selectedAlbum = null;
        } catch (NumberFormatException e) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Invalid Input");
            alert.setContentText("Total and Rented fields must be numeric!");
            alert.showAndWait();
        }
    }

    @FXML
    void DeleteFunction(MouseEvent event) throws IOException {
        Album selectedAlbum = albumTableData.getSelectionModel().getSelectedItem();
    
        if (selectedAlbum != null) {
            albumList.remove(selectedAlbum);
    
            Alert successAlert = new Alert(AlertType.INFORMATION);
            successAlert.setTitle("Success");
            successAlert.setHeaderText(null);
            successAlert.setContentText("Album successfully deleted!");
            successAlert.showAndWait();
        } else {
            Alert errorAlert = new Alert(AlertType.ERROR);
            errorAlert.setTitle("Error");
            errorAlert.setHeaderText("No Selection");
            errorAlert.setContentText("Please select an album to delete.");
            errorAlert.showAndWait();
        }
    }

    public void clearData() {
        tfNamaAlbum.clear();
        tfArtist.clear();
        tfTotal.clear();
        tfRented.clear();
    }

    private void populateFields(Album album) {
        selectedAlbum = album; 
        tfNamaAlbum.setText(album.getNamaAlbum());
        tfArtist.setText(album.getArtist());
        tfTotal.setText(String.valueOf(album.getTotal()));
        tfRented.setText(String.valueOf(album.getTotal() - album.getAvailable()));
    }

    private boolean isNamaAlbumExists(String NamaAlbum) {
        return albumList.stream().anyMatch(album -> album.getNamaAlbum().equalsIgnoreCase(NamaAlbum));
    }
    
    @FXML
    void RentSelectionFunction(MouseEvent event) throws IOException {
        Album selectedAlbum = albumTableData.getSelectionModel().getSelectedItem();
    
        if (selectedAlbum == null) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("No Album Selected");
            alert.setContentText("Please select an album to rent.");
            alert.showAndWait();
            return;
        }
    
        if (selectedAlbum.getAvailable() <= 0) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Out of Stock");
            alert.setContentText("No available copies to rent.");
            alert.showAndWait();
            return;
        }
    
        selectedAlbum.setAvailable(selectedAlbum.getAvailable() - 1);
    
        albumTableData.refresh();
    
        Alert successAlert = new Alert(AlertType.INFORMATION);
        successAlert.setTitle("Success");
        successAlert.setHeaderText(null);
        successAlert.setContentText("Album successfully rented!");
        successAlert.showAndWait();
    }    
}
