package creationalPatterns.singleton.eagerInitialization;

public class SingletonClass {

    //The simplest version. It's thread safe but will always be created even if not needed.
    //Only an option if the class is lightweight.
    //But the innerclass approach is still preferable.
    private static SingletonClass uniqueInstance = new SingletonClass();

    //you can do the initialization inside a static block if error handling is needed

    private SingletonClass() {
    }


    public static SingletonClass getInstance() {
        return uniqueInstance;
    }

}