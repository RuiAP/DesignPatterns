package creationalPatterns.abstractFactory.colors;

public class BlueLines implements Color{

    @Override
    public void fill() {
        System.out.println("Painted the lines blue.");
    }
}
