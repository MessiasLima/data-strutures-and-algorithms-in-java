package examples.chapter1.exercises.reinforcement;

/**
 * Write a short Java method, isEven, that takes an int i and returns true if and only
 * if i is even. Your method cannot use the multiplication, modulus, or division
 * operators, however.
 */
public class Four {
    public static void main(String[] args) {
        System.out.println(isEven(0));
        System.out.println(isEven(1));
        System.out.println(isEven(2));
        System.out.println(isEven(3));
        System.out.println(isEven(4));
        System.out.println(isEven(-5));
        System.out.println(isEven(-6));
    }

    private static boolean isEven(int i) {
        if (i < 0) {
            i = i * -1;
        }

        while (i >= 2){
            i -= 2;
        }

        return i == 0;
    }
}
