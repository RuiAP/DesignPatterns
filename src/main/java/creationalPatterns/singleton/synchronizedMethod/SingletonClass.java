package creationalPatterns.singleton.synchronizedMethod;

public class SingletonClass {

    private volatile static SingletonClass uniqueInstance = null;

    private int data = 0;

    private SingletonClass(){
    }


    //This is a way to use a thread safe approach that has much better performance
    //than just synchronizing the method. Butt the inner class approach is better!
    public static SingletonClass getInstance(){
        if(uniqueInstance == null) {
            synchronized (SingletonClass.class){
                //we make the instance volatile and only synchronize when its instantiated
                if(uniqueInstance == null){
                    uniqueInstance = new SingletonClass();
                }
            }

        }
        return uniqueInstance;
    }

 /*
    //This is an approach with MUCH WORSE performance!
    //after the (first/only) instantiation the synchronized is not necessary and
    //could be a big performance overhead /bottleneck --> there are better ways to do this
    public synchronized static SingletonClass getInstance(){
        if(uniqueInstance == null) {
            uniqueInstance = new SingletonClass();
        }
        return uniqueInstance;
    }
 */


    public void setData(int newData){
        this.data = newData;
    }

    public int getData(){
        return this.data;
    }

}
