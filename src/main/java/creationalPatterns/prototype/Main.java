package creationalPatterns.prototype;


public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        //Nota: cloneable interface is just a marker interface (doesn't have the clone method)
        Rifleman r1 = new Rifleman(1,2,3);
        GameUnit s1 = new Swordsman(1,2,3);

        r1.pickUpAmmo();
        r1.pickUpAmmo();
        System.out.println("r1: "+r1);
        Rifleman r2 = (Rifleman) r1.clone();
        System.out.println("r2: "+r2);
        //Swordsman s2 = (Swordsman) s1.clone(); //this is supposed to throw an error


        //FUN FACT
//        System.out.println(r1.hashCode());
//        System.out.println(System.identityHashCode(r1));
//        System.out.println(r1.getClass().getSimpleName()+"@"+Integer.toHexString(System.identityHashCode(r1)));
    }

}
