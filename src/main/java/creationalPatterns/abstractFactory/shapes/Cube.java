package creationalPatterns.abstractFactory.shapes;


import creationalPatterns.abstractFactory.Shape;

public class Cube implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw a cube");
    }
}
