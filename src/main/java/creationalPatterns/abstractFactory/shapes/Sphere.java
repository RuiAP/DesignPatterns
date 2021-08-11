package creationalPatterns.abstractFactory.shapes;


import creationalPatterns.abstractFactory.Shape;

public class Sphere implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw a sphere.");
    }
}
