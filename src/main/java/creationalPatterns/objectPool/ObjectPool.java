package creationalPatterns.objectPool;

//added this interface by myself (was not present in the example)
public interface ObjectPool<T extends Poolable> {

    T get();
    void release(T poolableObject);
}
