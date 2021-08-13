package creationalPatterns.objectPool;

import javafx.geometry.Point2D;


public class ImageImpl implements Image{

    private Point2D location;
    private String simulatedImage;

    public ImageImpl(String simulatedImage) {
        this.simulatedImage = simulatedImage;
        this.location = new Point2D(0.0, 0.0);
    }

    @Override
    public void draw() {
        System.out.println("Drawing image at "+location.getX()+"x and "+location.getY()+"y ... : "+ simulatedImage);
    }

    @Override
    public Point2D getLocation() {
        return this.location;
    }

    @Override
    public void setLocation(Point2D location) {
        this.location = location;
    }

    @Override
    public void reset() {
        System.out.println("image resetting...");
        this.location = new Point2D(0.0,0.0);
    }
}
