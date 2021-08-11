package creationalPatterns.abstractFactory.colors;

public class Blue implements Color{
    @Override
    public void fill() {
        System.out.println("Painted the surface with blue.");
    }
}
