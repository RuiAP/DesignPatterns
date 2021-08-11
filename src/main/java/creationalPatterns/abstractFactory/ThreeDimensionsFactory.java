package creationalPatterns.abstractFactory;

import creationalPatterns.abstractFactory.colors.*;
import creationalPatterns.abstractFactory.shapes.*;

public class ThreeDimensionsFactory extends AbstractFactory{
    @Override
    public Color getColor(String colorType) {
        if(colorType==null|| colorType.isEmpty()){
            return null;
        }
        switch(colorType.toLowerCase()){
            case "red":
                return new Red();
            case "blue":
                return new Blue();
            case "green":
                return new Green();
            default:
                throw new UnsupportedOperationException("Color name not supported");
        }
    }

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType==null|| shapeType.isEmpty()){
            return null;
        }
        switch(shapeType.toLowerCase()){
            case "rectangle":
                return new RectangularPrism();
            case "circle":
                return new Sphere();
            case "square":
                return new Cube();
            default:
                throw new UnsupportedOperationException("Shape name not supported");
        }
    }
}
