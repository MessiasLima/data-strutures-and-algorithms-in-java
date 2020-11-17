package examples.chapter3.scoreboard;

import java.util.Arrays;

public class Scoreboard {
    private final GameEntry[] board;
    private int numberOfEntries = 0;

    public Scoreboard(int capacity) {
        board = new GameEntry[capacity];
    }

    public int getNumberOfEntries() {
        return numberOfEntries;
    }

    public void add(GameEntry gameEntry) {
        int newScore = gameEntry.getScore();

        if (numberOfEntries < board.length || newScore > board[numberOfEntries - 1].getScore()) {

            if (numberOfEntries < board.length) {
                numberOfEntries++;
            }

            int i = numberOfEntries - 1;

            while (i > 0 && board[i - 1].getScore() < newScore) {
                board[i] = board[i - 1];
                i--;
            }

            board[i] = gameEntry;
        }

        System.out.println(Arrays.toString(board));
    }

    public GameEntry remove(int indexToRemove) throws IndexOutOfBoundsException {
        if (indexToRemove < 0 || indexToRemove > numberOfEntries - 1) {
            throw new IndexOutOfBoundsException();
        }

        GameEntry removedGameEntry = board[indexToRemove];

        for (int j = indexToRemove; j < numberOfEntries - 1; j++) {
            board[j] = board[j + 1];
        }

        board[numberOfEntries - 1] = null;

        numberOfEntries--;

        System.out.println(Arrays.toString(board));

        return removedGameEntry;
    }
}
