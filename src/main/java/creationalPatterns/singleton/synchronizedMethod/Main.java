package creationalPatterns.singleton.synchronizedMethod;

public class Main {
    public static void main(String[] args) {
        //DISADVANTAGE: the use of singleton and the use of static methods make it
        // much harder to unit test code. Dependency injection might be a good alternative

        //A good use case is usually when you have a single object(same reference) that
        // you use all over the place like, for example, a logger. Makes no sense to
        // keep injecting the dependency in every class. Just use a singleton.

        SingletonClass mySingleton = SingletonClass.getInstance();

        System.out.println("Singleton1 reference: "+ mySingleton);
        System.out.println("Initial data in the singleton: "+mySingleton.getData());
        int newData = 200;
        mySingleton.setData(newData);
        System.out.println("Set new data to: "+ newData+"\n");

        SingletonClass mySingleton2 = SingletonClass.getInstance();
        System.out.println("Singleton2 reference: "+ mySingleton);
        System.out.println("Data fetched from the second instance is: "+ mySingleton2.getData());

    }
}
