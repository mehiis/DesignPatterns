package org.example.Structural.Strategy;

import org.example.Structural.Strategy.SortingAlgorithms.CombSort;
import org.example.Structural.Strategy.SortingAlgorithms.InsertionSort;
import org.example.Structural.Strategy.SortingAlgorithms.SelectionSort;
import org.example.Structural.Strategy.SortingAlgorithms.SortContext;

import java.util.Random;

public class Main {
    public static int[] sArray = new int[100];
    public static int[] lArray = new int[250000];

    public static void main(String[] args) {
        initializeArrays();


        SortContext sorter;

        //COMB SORT
        sorter = new SortContext(new CombSort());
        startSorting(sorter, "Comb sort");

        //INSERTION SORT
        sorter = new SortContext(new InsertionSort());
        startSorting(sorter, "Insertion sort");

        //SELECTION SORT
        sorter = new SortContext(new SelectionSort());
        startSorting(sorter, "Selection sort");
    }

    public static void initializeArrays() {
        for (int i = 0; i < sArray.length; i++) {
            Random rand = new Random();
            sArray[i] = rand.nextInt(10000);
        }

        for (int i = 0; i < lArray.length; i++) {
            Random rand = new Random();
            lArray[i] = rand.nextInt(10000);
        }
    }

    public static void startSorting(SortContext sorter, String sortingAlgorithm) {
        long startTime;
        long endTime;
        double totalTime;

        startTime = System.nanoTime();
        sorter.sort(sArray);
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println(sortingAlgorithm + " small array sort time was " + (totalTime) + " nanoseconds.");

        startTime = System.nanoTime();
        sorter.sort(lArray);
        endTime   = System.nanoTime();
        totalTime = (endTime - startTime) / 1000000000.0;;


        System.out.println(sortingAlgorithm + " large array sort time was " + (totalTime) + " seconds.\n\n");
    }
}