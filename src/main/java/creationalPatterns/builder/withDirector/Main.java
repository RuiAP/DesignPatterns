package creationalPatterns.builder.withDirector;

public class Main {

    public static void main(String[] args) {


        VehicleDirector director = new VehicleDirector();
        Vehicle car = director.buildCar();
        System.out.println("\n\n");
        Vehicle bike = director.buildBike();
        System.out.println("\n\n");
        Vehicle tank = director.buildTank();
        System.out.println("\n\n");
    }
}
