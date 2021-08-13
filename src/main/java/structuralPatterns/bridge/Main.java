package structuralPatterns.bridge;

public class Main {
        //NOTICE that the example it's implemented using only one Implementor interface but
    //there can be multiple. The MediaResource could've accepted multiple references in the
    // constructor. (multiple references of different interfaces, not different
    // implementation of the same interface/implementor).

    public static void main(String[] args) {
        //Great video explaining this pattern
        //https://www.youtube.com/watch?v=F1YQ7YRjttI
        //decided to build the example presented in the video instead of the one in "example.png"

        //NOTE: the Music and Movie class were not necessary but I think it helps.

        Movie Shawshank = getMovie();
        MediaResource movieResource = new MovieResource(Shawshank);
        Music NovemberRain = getMusic();
        MediaResource musicResource = new MusicResource(NovemberRain);

        System.out.println("\n####################################################\n");
        //MOVIE FULLVIEW
        AbstractView movieFullPageView = new FullPageView(movieResource);
        System.out.println("Fullview Movie html:");
        System.out.println(movieFullPageView.generateViewInHTML());
        //MUSIC FULLVIEW
        System.out.println("__________");
        System.out.println("Fullview Music html:");
        AbstractView musicFullPageView = new FullPageView(musicResource);
        System.out.println(musicFullPageView.generateViewInHTML());

        System.out.println("\n###############################################\n");

        //MOVIE THUMBNAILVIEW
        AbstractView moviethumbnailView = new ThumbnailView(movieResource);
        System.out.println("Thumbnail Movie html:");
        System.out.println(moviethumbnailView.generateViewInHTML());
        //MUSIC THUMBNAILVIEW
        System.out.println("__________");
        AbstractView musicThumbnailView = new ThumbnailView(musicResource);
        System.out.println("Thumbnail Music html:");
        System.out.println(musicThumbnailView.generateViewInHTML());

        System.out.println("\n###############################################");




    }


    private static Movie getMovie(){
        return new Movie("Stephen King", "the Shawshank Redemption", "Cover Image",
                "Morgan Freeman, Tim Robbins, etc.",
        "Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.",
                1994);
    }

    private static Music getMusic(){
        return new Music("November Rain", "Guns N'Roses", "Use Your Illusion I",
                "Album Image",1992,
                "\"November Rain\" is a song by the American hard rock band Guns N' Roses.\n" +
                        " Written by the band's lead vocalist Axl Rose, it was released as a single in\n" +
                        " 1992 from their third studio album, Use Your Illusion I (1991).");
    }
}
