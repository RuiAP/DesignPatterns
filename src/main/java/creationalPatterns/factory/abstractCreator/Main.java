package creationalPatterns.factory.abstractCreator;

public class Main {

    public static void main(String[] args) {
        //This is the more 'strict' implementation of the Factory Method

        //requer uma fabrica especifica para cada produto
        //Neste caso existe uma abstrata e depois ha uma impl para circulo, rectangulo, quadrardo, etc


        Shape shape1 = new CircleFactory().getShape();
        shape1.draw();

        Shape shape2 = new SquareFactory().getShape();
        shape2.draw();

        Shape shape3 = new RectangleFactory().getShape();
        shape3.draw();

    }
}
