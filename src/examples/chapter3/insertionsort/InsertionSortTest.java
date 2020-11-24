package examples.chapter3.insertionsort;

import java.util.*;

public class InsertionSortTest {
    public static void main(String[] args) {
        Integer[] arrayToSort = new Integer[]{2, 7, 9, 1, 4, 5, 3, 8, 6};
        System.out.println(Arrays.toString(InsertionSort.sort(arrayToSort)));

        Integer[] values = new Integer[10];
        for (int i = 0; i < 10; i++) {
            values[i] = new Random().nextInt(100);
        }
        Integer[] sortedArray = InsertionSort.sort(values);
        System.out.println(Arrays.toString(sortedArray));
    }
}
