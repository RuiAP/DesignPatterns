package creationalPatterns.factory.concreteCreatorStatic;

public class Main {
    public static void main(String[] args) {
        //Exact same thing as the Concrete Creator but with a static method

        //this way the  client doesn't need to instantiate the factory

        //the disadvantage is that you cannot subclass and change the behaviour
        //  of the creator method


        Shape shape1 = ShapeFactory.getShape("circle");
        shape1.draw();

        Shape shape2 = ShapeFactory.getShape("square");
        shape2.draw();

        Shape shape3 = ShapeFactory.getShape("rectangle");
        shape3.draw();

    }
}
