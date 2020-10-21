package examples.chapter1.exercises.reinforcement;

import java.util.Scanner;

/**
 * Write a short Java method, inputAllBaseTypes, that inputs a different value of
 * each base type from the standard input device and prints it back to the standard
 * output device.
 */
public class One {
    public static void main(String[] args) {
        inputAllBaseTypes();
    }

    private static void inputAllBaseTypes() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a boolean");
        boolean b = scanner.nextBoolean();
        System.out.println(b);

        System.out.println("Type a char");
        char c = scanner.next().charAt(0);
        System.out.println(c);

        System.out.println("Type a byte");
        byte by = scanner.nextByte();
        System.out.println(by);

        System.out.println("Type a short");
        short s = scanner.nextShort();
        System.out.println(s);

        System.out.println("Type a int");
        int i = scanner.nextInt();
        System.out.println(i);

        System.out.println("Type a long");
        long l = scanner.nextLong();
        System.out.println(l);

        System.out.println("Type a float");
        float f = scanner.nextFloat();
        System.out.println(f);

        System.out.println("Type a double");
        double d = scanner.nextDouble();
        System.out.println(d);
    }
}
