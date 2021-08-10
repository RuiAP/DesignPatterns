package creationalPatterns.factory.concreteCreator;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw a Rectangle");
    }
}
