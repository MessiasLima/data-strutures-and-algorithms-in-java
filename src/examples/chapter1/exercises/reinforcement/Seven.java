package examples.chapter1.exercises.reinforcement;

/**
 * Write a short Java method that takes an integer n and returns the sum of the
 * squares of all positive integers less than or equal to n.
 */
public class Seven {
    public static void main(String[] args) {
        System.out.println(sumOfOddPositives(5) == 55);
        System.out.println(sumOfOddPositives(3) == 14);
    }

    private static int sumOfOddPositives(int n) {
        if (n <= 0) return 0;
        int sum = 0;

        for (int i = n; i > 0; i--) {
            sum += square(i);
        }

        return sum;
    }

    private static int square(int n) {
        return n * n;
    }
}
