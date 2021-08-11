package creationalPatterns.abstractFactory.colors;

public class GreenLines implements Color{

    @Override
    public void fill() {
        System.out.println("Painted the lines green.");
    }
}
