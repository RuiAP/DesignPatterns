package structuralPatterns.bridge;

public class MovieResource implements MediaResource{

    Movie movie;

    public MovieResource(Movie movie) {
        this.movie = movie;
    }

    @Override
    public String title() {
        return movie.getMovieTitle();
    }

    @Override
    public String image() {
        return movie.getCoverImage();
    }

    @Override
    public String textContent() {
        return movie.getSinopse();
    }

    @Override
    public String author() {
        return movie.getMovieWriter();
    }
}
