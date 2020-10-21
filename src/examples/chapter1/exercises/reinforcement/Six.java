package examples.chapter1.exercises.reinforcement;

/**
 * Write a short Java method that takes an integer n and returns the sum of all the
 * odd positive integers less than or equal to n.
 */
public class Six {
    public static void main(String[] args) {
        System.out.println(sumOfOddPositives(5) == 9);
        System.out.println(sumOfOddPositives(3) == 4);
    }

    private static int sumOfOddPositives(int n) {
        if (n <= 0) return 0;
        int sum = 0;

        for (int i = n; i > 0; i--) {
            if (isOdd(i)) {
                sum += i;
            }
        }

        return sum;
    }

    private static boolean isOdd(int n) {
        return n % 2 != 0;
    }
}
