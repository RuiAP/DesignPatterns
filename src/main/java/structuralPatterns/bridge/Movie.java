package structuralPatterns.bridge;

public class Movie {

    private String movieWriter;
    private String movieTitle;
    private String coverImage;
    private String cast;
    private String sinopse;
    private int releaseYear;

    public Movie(String movieWriter, String movieTitle, String coverImage,
                 String cast, String sinopse, int releaseYear) {

        this.movieWriter = movieWriter;
        this.movieTitle = movieTitle;
        this.coverImage = coverImage;
        this.cast = cast;
        this.sinopse = sinopse;
        this.releaseYear = releaseYear;
    }

    public String getMovieWriter() {
        return movieWriter;
    }

    public void setMovieWriter(String movieWriter) {
        this.movieWriter = movieWriter;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}
