package examples.chapter1.exercises.reinforcement;

/**
 * Suppose that we create an array A of GameEntry objects, which has an integer
 * scores field, and we clone A and store the result in an array B. If we then im-
 * mediately set A[4].score equal to 550, what is the score value of the GameEntry
 * object referenced by B[4]?
 */
public class Two {
    public static void main(String[] args) {
        GameEntry[] a = new GameEntry[]{
            new GameEntry(1),
            new GameEntry(2),
            new GameEntry(4),
            new GameEntry(3),
            new GameEntry(5),
        };

        GameEntry[] b = a.clone();

        a[4].setScores(550);

        System.out.println(b[4].getScores());
    }
}
