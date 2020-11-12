package examples.chapter3.scoreboard;

public class GameEntry {
    private final String name;
    private final String score;

    public GameEntry(String name, String score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public String getScore() {
        return score;
    }
}
