package examples.chapter3.scoreboard;

public class TestScoreBoard {
    public static void main(String[] args) {
        Scoreboard scoreboard = new Scoreboard(5);
        scoreboard.add(new GameEntry("Messias", 100));
        scoreboard.add(new GameEntry("Joao", 23));
        scoreboard.add(new GameEntry("Maria", 51));
        scoreboard.add(new GameEntry("Fernando", 233));
        scoreboard.add(new GameEntry("Joana", 9));
        scoreboard.add(new GameEntry("Josefa", 19));

        scoreboard.remove(2);
        scoreboard.remove(0);

        scoreboard.add(new GameEntry("Sarah", 99));
    }
}
