package Behavioral.Iterator;

import java.util.Iterator;

public class FibonacciSequence implements Sequence {
    //this does not store any data, but could potentially store generated integers and handle removing or adding them from the sequence.
    //But because it is an infinite loop it does not have to handle it in this example.
    @Override
    public Iterator<Integer> iterator() {
        return new FibonacciIterator();
    }
}
