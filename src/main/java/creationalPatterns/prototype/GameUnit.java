package creationalPatterns.prototype;

import javafx.geometry.Point3D;

public abstract class GameUnit {

    private Point3D position;

    public GameUnit(double x, double y, double z){
        this.position = new Point3D(x,y,z);
    }

    public void move(double x, double y, double z){
        this.position = new Point3D(x,y,z);
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException{
        GameUnit unit = (GameUnit)super.clone();
        unit.move(0,0,0);
        unit.reset();
        return unit;
    }

    protected abstract void reset();

}
