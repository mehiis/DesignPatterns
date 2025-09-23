package Structural.Strategy.SortingAlgorithms;

public class SortContext {
    public AbstractSorter sorter;


    public SortContext(AbstractSorter paymentStrategy) {
        this.sorter = paymentStrategy;
    }

    public int[] sort(int[] arr) {
        return sorter.sort(arr);
    }
}
