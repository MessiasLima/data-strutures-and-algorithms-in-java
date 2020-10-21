package examples.chapter1.exercises.reinforcement;

/**
 * Write a short Java method that takes an integer n and returns the sum of all
 * positive integers less than or equal to n
 */
public class Five {
    public static void main(String[] args) {
        System.out.println(sumOfPositives(5) == 15);
        System.out.println(sumOfPositives(3) == 6);
    }

    private static int sumOfPositives(int n) {
        if (n <= 0) return 0;
        int sum = 0;

        for (int i = n; i > 0; i--){
            sum += i;
        }

        return sum;
    }
}
