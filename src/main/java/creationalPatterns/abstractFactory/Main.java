package creationalPatterns.abstractFactory;

import creationalPatterns.abstractFactory.colors.Color;

public class Main {
    public static void main(String[] args) {

        AbstractFactory twoDimensionFactory = FactoryProducer.getFactory("2d");
        AbstractFactory threeDimensionFactory = FactoryProducer.getFactory("3d");
        //em vez de "rectangle", "square",etc podia ser "int numberOfSides" (2,3,etc)

        //Podiamos tambem criar o padrão com outra ordem dos objetos/familias. Por exemplo:
        //retornar uma shapefactory e uma colorFactory e depois em cada uma chamar o metodo "get2dVersion()" e "get3dVersion()"
        //(neste case talvez não faça muito sentido mas existem muitos casos em que é possivel implementar das duas maneiras)


        //2d stuff can be rendered together
        Shape s1 = twoDimensionFactory.getShape("circle");
        Color c1 = twoDimensionFactory.getColor("blue");
        s1.draw();
        c1.fill();


        //3d stuff can be rendered together
        Shape s2 = threeDimensionFactory.getShape("circle");
        Color c2 = threeDimensionFactory.getColor("blue");
        s2.draw();
        c2.fill();

    }
}
