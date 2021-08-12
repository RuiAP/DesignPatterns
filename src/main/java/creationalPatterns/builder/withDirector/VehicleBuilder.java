package creationalPatterns.builder.withDirector;

public interface VehicleBuilder { //aka abstract builder

    VehicleBuilder addBody();
    VehicleBuilder addWheels();
    VehicleBuilder addEngine();
    VehicleBuilder addHeadlights();

    Vehicle build();

}
