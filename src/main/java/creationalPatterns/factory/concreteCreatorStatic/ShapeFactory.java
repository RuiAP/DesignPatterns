package creationalPatterns.factory.concreteCreatorStatic;

public class ShapeFactory {

    public static Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }else if (shapeType.equalsIgnoreCase("Circle")){
            return new Circle();
        }else if (shapeType.equalsIgnoreCase("Square")){
            return new Square();
        }else if(shapeType.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }else{
            throw new UnsupportedOperationException("Shape note recognized.");
        }
    }
}
