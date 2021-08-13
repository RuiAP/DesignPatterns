package creationalPatterns.prototype;

public class Swordsman extends GameUnit{

    private int swordDurability;
    private String state;

    public Swordsman(double x, double y, double z) {
        super(x, y, z);
        this.swordDurability =5;
        this.state="idle";
    }

    public void repairSword(){
        this.swordDurability = 10;
    }

    public void attack(){
        this.state="attacking";
    }

    public void setSwordDurability(int swordDurability) {
        this.swordDurability = swordDurability;
    }

    public void setState(String state) {
        this.state = state;
    }

    //just implement the reset() na don't override clone() and this class can be cloned (like the Rifleman example)
//    @Override
//    protected void reset() {
//        this.swordDurability=5;
//        this.state = "idle";
//    }



    //IF for some reason this class CANNOT BE CLONED then
    //just override the clone() method and use the CloneNotSupportedException
    //The reason to use "throws" in the supper class is that it's possible to throw it here

    //TECHNICALLY you don't even have to implement clone() (you just need the reset(), because its abstract) and the
    //client code will get a standard CloneNotsupportedException.
    //but implementing it and having a custom error seems better imo.

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
       throw new CloneNotSupportedException("This unit cannot be cloned");
    }

    protected void reset(){
        throw new UnsupportedOperationException("This unit cannot be cloned so it doesnt support a reset method.");
    }

    @Override
    public String toString() {
        return "Swordsman in "+state+" state. (Sword durebility: "+swordDurability+").";
    }
}
