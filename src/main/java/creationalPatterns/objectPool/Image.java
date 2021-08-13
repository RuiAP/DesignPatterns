package creationalPatterns.objectPool;

import javafx.geometry.Point2D;

/**
 * the object we are going to pool(assuming its expensive to load it from disk)
 */
public interface Image extends Poolable {

    void draw();

     Point2D getLocation();

     void setLocation(Point2D location);
}
