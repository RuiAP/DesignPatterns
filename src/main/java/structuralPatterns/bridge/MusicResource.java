package structuralPatterns.bridge;

public class MusicResource implements MediaResource{

   private Music music;

    public MusicResource(Music music) {
        this.music = music;
    }

    @Override
    public String title() {
        return music.getMusicName();
    }

    @Override
    public String image() {
        return music.getAlbumImage();
    }

    @Override
    public String textContent() {
        return music.getDescription();
    }

    @Override
    public String author() {
        return music.getArtist();
    }
}
