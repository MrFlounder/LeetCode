package Design;

import java.util.Iterator;

/**
 * Created by guangshuozang on 2/8/16.
 */
public class PeekingIterator_284 {
    private Integer next = null;
    private Iterator<Integer> iter;

    public PeekingIterator_284(Iterator<Integer> iterator) {
        // initialize any member here.
        iter = iterator;
        if (iter.hasNext())
            next = iter.next();
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return next;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.

    public Integer next() {
        Integer res = next;
        next = iter.hasNext() ? iter.next() : null;
        return res;
    }


    public boolean hasNext() {
        return next != null;
    }
}
