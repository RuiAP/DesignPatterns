package creationalPatterns.factory.abstractCreator;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Draw a Square");
    }
}
