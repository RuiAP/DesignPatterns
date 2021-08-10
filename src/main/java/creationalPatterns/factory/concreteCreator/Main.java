package creationalPatterns.factory.concreteCreator;

public class Main {
    public static void main(String[] args) {
        //most common implementation

        //single creator class
        //you a parameter with the product you want

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("circle");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("square");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("rectangle");
        shape3.draw();

    }
}
