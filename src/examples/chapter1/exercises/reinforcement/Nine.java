package examples.chapter1.exercises.reinforcement;

/**
 * Write a short Java method that uses a StringBuilder instance to remove all the
 * punctuation from a string s storing a sentence, for example, transforming the
 * string "Let’s try, Mike!" to "Lets try Mike".
 */
public class Nine {
    public static void main(String[] args) {
        System.out.println(removePunctuation("Let’s try, Mike!"));
    }

    private static String removePunctuation(String s) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz ";

        StringBuilder stringBuilder = new StringBuilder();
        for (String character : s.split("")){
            if (alphabet.contains(character.toLowerCase())){
                stringBuilder.append(character);
            }
        }

        return stringBuilder.toString();
    }
}
