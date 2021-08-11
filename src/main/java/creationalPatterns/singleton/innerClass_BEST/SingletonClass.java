package creationalPatterns.singleton.innerClass_BEST;

public class SingletonClass {

    /**
     * This is regarded as the standard implementation -- the Bill Pugh Approach
     */

    private int data = 0;

    //private constructor
    private SingletonClass(){
    }

    //private inner class that eagerly instantiates the singleton instance but only
    //when the getInstance method is called!
    // The SingletonHelper class only gets loaded into memory when the method is
    // called, so the singleton is only instantiated (at that time) when its needed.
    private static class SingletonHelper{
        private static final SingletonClass UNIQUE_INSTANCE = new SingletonClass();
    }


    public static SingletonClass getInstance(){
        return SingletonHelper.UNIQUE_INSTANCE;
    }


    public void setData(int newData){
        this.data = newData;
    }

    public int getData(){
        return this.data;
    }



}
