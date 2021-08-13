package creationalPatterns.objectPool;

import javafx.geometry.Point2D;

public class Main {
    public static void main(String[] args) {
        //In  production it would be recommended to use a third party library for this
        //since, in the few scenarios that this pattern is necessary/helpful, it can become
        // complicated to manage. Mostly because of multi threading safety

        ObjectPool<Image> ImagePool = new ObjectPoolImpl<>(
                ()-> new ImageImpl("This is a mountain image")
                ,3);

        Image image1 = ImagePool.get();
        image1.setLocation(new Point2D(10.0, 20.0));
        image1.draw();

        Image image2 = ImagePool.get();
        image2.draw();
        ImagePool.release(image2);

        Image image3 = ImagePool.get();
        image3.draw();
        ImagePool.release(image3);


        ImagePool.release(image1);
        ImagePool.release(image2);
    }
}
