package Labyrinth;

public class Startmenu {
    private int difficulty;
    private int[][] boardsize;
    private String infoVersionAuthors;

    public Startmenu(int difficulty, int[][] boardsize, String infoVersionAuthors) {
        this.difficulty = difficulty;
        this.boardsize = boardsize;
        this.infoVersionAuthors = infoVersionAuthors;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public int[][] getBoardsize() {
        return boardsize;
    }

    public String getInfoVersionAuthors() {
        return infoVersionAuthors;
    }
}
