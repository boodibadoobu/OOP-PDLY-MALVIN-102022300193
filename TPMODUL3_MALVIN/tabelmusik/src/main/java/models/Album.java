package models;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Album {
    private final SimpleStringProperty albumName;
    private final SimpleStringProperty artist;
    private final SimpleIntegerProperty available;
    private final SimpleIntegerProperty total;

    public Album(String albumName, String artist, int available, int rented, int total) {
        this.albumName = new SimpleStringProperty(albumName);
        this.artist = new SimpleStringProperty(artist);
        this.available = new SimpleIntegerProperty(available);
        this.total = new SimpleIntegerProperty(total);
    }

    public String getAlbumName() {
        return albumName.get();
    }

    public void setAlbumName(String albumName) {
        this.albumName.set(albumName);
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
