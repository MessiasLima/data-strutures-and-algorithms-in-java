package examples.chapter1.exercises.creativity;

/**
 * Write a short Java method that takes an array of int values and determines if there
 * is a pair of distinct elements of the array whose product is even.
 */
public class Seventeen {
    public static void main(String[] args) {
        System.out.println(theresAnyProductEven(new int[]{1, 2, 3, 4, 5}));
        System.out.println(theresAnyProductEven(new int[]{2, 2, 2, 2, 2}));
        System.out.println(theresAnyProductEven(new int[]{3, 7, 12, 43, 29}));
    }

    private static boolean theresAnyProductEven(int[] array) {
        for (int i = 0; i < (array.length - 1); i++) {
            for (int j = i + 1; j < array.length; j++) {

                int a = array[i];
                int b = array[j];

                if (a == b) {
                    continue;
                }

                int n = a * b;

                if (isEven(n)) {
                    System.out.println(a +" * " + b + " = " + n);
                    System.out.println(n + " is even!");
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
