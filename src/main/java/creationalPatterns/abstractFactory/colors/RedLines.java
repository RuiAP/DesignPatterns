package creationalPatterns.abstractFactory.colors;

public class RedLines implements Color{
    @Override
    public void fill() {
        System.out.println("Painted the lines red.");
    }
}
