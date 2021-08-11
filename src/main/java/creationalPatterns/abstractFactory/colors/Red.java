package creationalPatterns.abstractFactory.colors;

public class Red implements Color{
    @Override
    public void fill() {
        System.out.println("Painted the surface with red.");
    }
}
