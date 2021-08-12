package creationalPatterns.builder.withDirector;

public class VehicleDirector {

    public Vehicle buildCar(){
        VehicleBuilder builder = new CarBuilderImpl();
        return buildVehicle(builder);
    }

    public Vehicle buildBike(){
        VehicleBuilder builder = new BikeBuilderImpl();
        return buildVehicle(builder);
    }

    //this is assuming they all have the same parts but implemented in different ways
    private Vehicle buildVehicle(VehicleBuilder builder){
        builder.addBody();
        builder.addWheels();
        builder.addEngine();
        builder.addHeadlights();
        return builder.build();
    }

    //if a vehicle didn't require all that stuff or was substancially different
    //then it would call different methods
    public Vehicle buildTank(){
        //if you needed a specific method that only exists in the TankBuilderImpl
        //you can just change VehicleBuilder by TankBuilderImpl
//        TankBuilderImpl builder = new TankBuilderImpl();
//        builder.addGuns();
        VehicleBuilder builder = new TankBuilderImpl();
        builder.addBody();
        builder.addEngine();

        return builder.build();
    }
}
