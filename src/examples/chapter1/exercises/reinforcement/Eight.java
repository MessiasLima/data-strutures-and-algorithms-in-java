package examples.chapter1.exercises.reinforcement;

/**
 * Write a short Java method that counts the number of vowels in a given character
 * string.
 */
public class Eight {
    public static void main(String[] args) {
        System.out.println(numberOfVowels("aeiou") == 5);
        System.out.println(numberOfVowels("oooo") == 4);
        System.out.println(numberOfVowels("messias") == 3);
        System.out.println(numberOfVowels("rtkjl") == 0);
    }

    private static int numberOfVowels(String str) {
        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

        int count = 0;

        str = str.toLowerCase();

        for (char character: str.toCharArray()){
            for (char vowel : vowels) {
                if (character == vowel) {
                    count++;
                }
            }
        }

        return count;
    }
}
