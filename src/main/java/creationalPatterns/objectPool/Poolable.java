package creationalPatterns.objectPool;

/**
 * Identifies the object we can pool
 */
public interface Poolable {


    /**
     * Resets the object to its initial state when it is realeased.
     * So that it can be served later.
     */
    void reset();
}
