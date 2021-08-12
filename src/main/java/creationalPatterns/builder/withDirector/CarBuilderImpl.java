package creationalPatterns.builder.withDirector;

public class CarBuilderImpl implements VehicleBuilder {
    @Override
    public VehicleBuilder addBody() {
        System.out.println("Adds a car body");
        return this;
    }

    @Override
    public VehicleBuilder addWheels() {
        System.out.println("Adds 4 wheels and a spare");
        return this;
    }

    @Override
    public VehicleBuilder addEngine() {
        System.out.println("Adds a robust 2L V4 engine made by bmw for a perfect car.");
        return this;
    }

    @Override
    public VehicleBuilder addHeadlights() {
        System.out.println("Two bi-xenon headlights for this luxury car.");
        return this;
    }

    @Override
    public Vehicle build() {
        System.out.println("A very comfortable car was build!");
        return new Car();
    }
}
