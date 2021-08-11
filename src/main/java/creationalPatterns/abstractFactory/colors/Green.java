package creationalPatterns.abstractFactory.colors;

public class Green implements Color{
    @Override
    public void fill() {
        System.out.println("Painted the surface with green.");
    }
}
