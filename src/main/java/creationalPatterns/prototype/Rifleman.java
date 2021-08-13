package creationalPatterns.prototype;


public class Rifleman extends GameUnit implements Cloneable{

    private int ammo;

    public Rifleman(double x, double y, double z) {
        super(x, y, z);
        this.ammo=5;
    }

    public void pickUpAmmo(){
        this.ammo +=15;
    }


    @Override
    protected void reset() {
        this.ammo=5;
    }


        @Override
    public String toString() {
        return "Rifleman with "+ ammo +" ammo";
    }
}
