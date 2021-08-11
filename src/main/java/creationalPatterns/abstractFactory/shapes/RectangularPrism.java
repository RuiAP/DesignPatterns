package creationalPatterns.abstractFactory.shapes;


import creationalPatterns.abstractFactory.Shape;

public class RectangularPrism implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw a rectangular prism or rectangular box or whatever...");
    }
}
