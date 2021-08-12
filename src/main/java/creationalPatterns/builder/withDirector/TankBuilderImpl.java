package creationalPatterns.builder.withDirector;

public class TankBuilderImpl implements VehicleBuilder{
    @Override
    public VehicleBuilder addBody() {
        System.out.println("Adds a tank body");
        return this;
    }

    @Override
    public VehicleBuilder addWheels() {
        System.out.println("Adds tank wheels");
        return this;
    }

    @Override
    public VehicleBuilder addEngine() {
        System.out.println("Adds big V12 to move a tank");
        return this;
    }

    @Override
    public VehicleBuilder addHeadlights() {
        System.out.println("Doesn't add anything. Tanks don't need headlights.");
        return this;
    }

    public VehicleBuilder addGuns(){
        System.out.println("A Tank needs as many guns as it can carry! Right?!");
        return this;
    }

    @Override
    public Vehicle build() {
        System.out.println("A nice tank is assembled!");
        return new Tank();
    }
}
