package Behavioral.Iterator;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {
    //this class in charge of iterating and has only the data to provide that kind of functionality

    //saving the previous and current iterations to provide the next
    private int previous = 0;
    private int current = 1;
    private boolean started = false;

    //infinite set on iteration, thus always true.
    @Override
    public boolean hasNext() { return true; }

    @Override
    public Integer next() {
        //to make sure it prints also the first zero in the sequence!!
        if(!started){
            started = true;
            return 0;
        }

        int next = previous + current;

        previous = current;
        current = next;

        return previous;
    }
}
