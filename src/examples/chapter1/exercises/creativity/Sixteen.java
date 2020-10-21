package examples.chapter1.exercises.creativity;

import java.util.Scanner;

/**
 * Write a short program that takes as input three integers, a, b, and c, from the Java
 * console and determines if they can be used in a correct arithmetic formula (in the
 * given order), like “a + b = c,” “a = b − c,” or “a ∗ b = c.”
 */
public class Sixteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input the A number");
        int a = scanner.nextInt();

        System.out.println("Please input the B number");
        int b = scanner.nextInt();

        System.out.println("Please input the C number");
        int c = scanner.nextInt();

        if (itMatchesTheFormula(a, b, c)) {
            System.out.println("The provided values can be used in a correct arithmetic formula");
        } else  {
            System.err.println("The provided values can't be used in a correct formula");
        }
    }

    private static boolean itMatchesTheFormula(int a, int b, int c) {
        return a + b == c ||
            a == b - c ||
            a * b == c;
    }
}
