package creationalPatterns.builder.withDirector;

public class BikeBuilderImpl implements VehicleBuilder {
    @Override
    public VehicleBuilder addBody() {
        System.out.println("A steel frame for a sturdy bike.");
        return this;
    }

    @Override
    public VehicleBuilder addWheels() {
        System.out.println("Two wheels it is!");
        return this;
    }

    @Override
    public VehicleBuilder addEngine() {
        System.out.println("A V3 is more than enough for a bike.");
        return this;
    }

    @Override
    public VehicleBuilder addHeadlights() {
        System.out.println("A bike just needs one good headlight.");
        return this;
    }

    @Override
    public Vehicle build() {
        System.out.println("Builds a jaw-dropping bike!");
        return new Bike();
    }
}
