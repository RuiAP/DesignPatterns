package structuralPatterns.bridge;

/**
 * Uses a mediaResource(book, music, movie, etc) to generate an Html page containing information
 * about that media resource. Different views will be needed according to device, device orientation, etc
 */
public abstract class AbstractView {

    MediaResource resource;

    public AbstractView(MediaResource resource) {
        this.resource = resource;
    }


    public abstract String generateViewInHTML();
}
