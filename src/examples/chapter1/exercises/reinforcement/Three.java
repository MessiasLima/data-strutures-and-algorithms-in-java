package examples.chapter1.exercises.reinforcement;

/**
 * Write a short Java method, isMultiple, that takes two long values, n and m, and
 * returns true if and only if n is a multiple of m, that is, n = mi for some integer i.
 */
public class Three {
    public static void main(String[] args) {
        System.out.println(isMultiple(12, 3));
    }

    private static boolean isMultiple(long n, long m) {
        return n % m == 0;
    }
}
