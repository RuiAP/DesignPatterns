package creationalPatterns.abstractFactory.shapes;

import creationalPatterns.abstractFactory.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw a Rectangle");
    }
}
