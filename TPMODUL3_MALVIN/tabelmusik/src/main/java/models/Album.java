package models;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Album {
    private final SimpleStringProperty NamaAlbum;
    private final SimpleStringProperty artist;
    private final SimpleIntegerProperty available;
    private final SimpleIntegerProperty total;

    public Album(String albumName, String artist, int available, int rented, int total) {
        this.NamaAlbum = new SimpleStringProperty(albumName);
        this.artist = new SimpleStringProperty(artist);
        this.available = new SimpleIntegerProperty(available);
        this.total = new SimpleIntegerProperty(total);
    }

    public String getNamaAlbum() {
        return NamaAlbum.get();
    }

    public void setNamaAlbum(String NamaAlbum) {
        this.NamaAlbum.set(NamaAlbum);
    }

    public String getArtist() {

        return artist.get();
    }

    public void setArtist(String artist) {

        this.artist.set(artist);
    }

    public int getAvailable() {

        return available.get();
    }

    public void setAvailable(int available) {

        this.available.set(available);
    }

    public int getTotal() {

        return total.get();
    }

    public void setTotal(int total) {

        this.total.set(total);
    }
}
