package creationalPatterns.abstractFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("3d")){
            return new ThreeDimensionsFactory();
        }else if (choice.equalsIgnoreCase("2d")){
            return new TwoDimensionsFactory();
        }else{
            throw new UnsupportedOperationException("input not supported");
        }
    }
}
