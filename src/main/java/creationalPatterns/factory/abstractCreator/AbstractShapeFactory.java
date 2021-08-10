package creationalPatterns.factory.abstractCreator;

public abstract class AbstractShapeFactory {

    protected abstract Shape factoryMethod();

    public Shape getShape(){
        return factoryMethod();
    }

    //other methods
}
