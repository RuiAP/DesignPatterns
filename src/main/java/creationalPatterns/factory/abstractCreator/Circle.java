package creationalPatterns.factory.abstractCreator;

public class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Draw a Circle");
    }
}
