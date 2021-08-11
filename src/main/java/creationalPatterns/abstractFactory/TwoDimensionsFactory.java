package creationalPatterns.abstractFactory;

import creationalPatterns.abstractFactory.colors.BlueLines;
import creationalPatterns.abstractFactory.colors.Color;
import creationalPatterns.abstractFactory.colors.GreenLines;
import creationalPatterns.abstractFactory.colors.RedLines;
import creationalPatterns.abstractFactory.shapes.Circle;
import creationalPatterns.abstractFactory.shapes.Rectangle;
import creationalPatterns.abstractFactory.shapes.Square;

public class TwoDimensionsFactory extends AbstractFactory {
    @Override
    public Color getColor(String colorType) {
        if(colorType==null|| colorType.isEmpty()){
            return null;
        }
        switch(colorType.toLowerCase()){
            case "red":
                return new RedLines();
            case "blue":
                return new BlueLines();
            case "green":
                return new GreenLines();
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
                return new Rectangle();
            case "circle":
                return new Circle();
            case "square":
                return new Square();
            default:
                throw new UnsupportedOperationException("Shape name not supported");
        }
    }
}
