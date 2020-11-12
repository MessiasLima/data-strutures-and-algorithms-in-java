package examples.chapter3.scoreboard;

public class Scoreboard {
    private final GameEntry[] board;

    public Scoreboard(int capacity) {
        board = new GameEntry[capacity];
    }

    public int getNumberOfEntries() {
        return board.length;
    }
}
