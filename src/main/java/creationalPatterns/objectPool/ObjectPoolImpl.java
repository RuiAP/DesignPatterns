package creationalPatterns.objectPool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;

public class ObjectPoolImpl<T extends Poolable> implements ObjectPool<T> {

    //this is going to act as the cache
    //It should be able to handle multi-thread operations
    BlockingQueue<T> availablePool;

    /**
     * Constructor
     * @param creator The supplier of the objects to be initialized
     * @param count The number of objects to have initialized at the start
     */
    public ObjectPoolImpl(Supplier<T> creator, int count) {
        this.availablePool = new LinkedBlockingQueue<>();
        for(int i = 0; i<count; i++){
            availablePool.offer(creator.get());
        }
    }

    @Override
    public T get() {
        try {
            //take is a blocking method so it will keep waiting if the pool is empty but
            // the implementation of get() could be substantially different
            // according to specific needs. (p.e. create new object if the pool is empty and limit
            //at a maxNumber and/or trim when there are a lot of unused objects)
            return availablePool.take();
        } catch (InterruptedException e) {
            System.err.println("take was interrupted");
            //e.printStackTrace();
        }
        return null;
    }


    @Override
    public void release(T reusableObject) {
        reusableObject.reset();
        availablePool.add(reusableObject);
    }
}
