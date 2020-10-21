package examples.chapter1.exercises.creativity;

import java.util.Arrays;

/**
 * Write a pseudocode description of a method that reverses an array of n integers,
 * so that the numbers are listed in the opposite order than they were before, and
 * compare this method to an equivalent Java method for doing the same thing.
 */
public class Fourteen {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(reversed(arr)));
    }

    private static Integer[] reversed(Integer[] intArray) {
        for (int i = 0; i < intArray.length/2; i++) {
            int element1 = intArray[i];
            intArray[i] = intArray[intArray.length - 1 - i];
            intArray[intArray.length - 1 - i] = element1;
        }

        return intArray;
    }
}
