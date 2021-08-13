package structuralPatterns.bridge;

public class Music {

    private String musicName;
    private String artist;
    private String album;
    private String albumImage;
    private int releaseYear;
    private String description;

    public Music(String musicName, String artist, String album,
                 String albumImage, int releaseYear, String description) {

        this.musicName = musicName;
        this.artist = artist;
        this.album = album;
        this.albumImage = albumImage;
        this.releaseYear = releaseYear;
        this.description = description;
    }


    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getAlbumImage() {
        return albumImage;
    }

    public void setAlbumImage(String albumImage) {
        this.albumImage = albumImage;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}