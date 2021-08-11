package creationalPatterns.abstractFactory;

import creationalPatterns.abstractFactory.colors.Color;

public abstract class AbstractFactory {
    //this isn't great because it doesnt respect the interface segregation principle
    //(the subclasses will only nee/use of one the methods)
    // but it's easier to demonstrate the pattern this way

    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
