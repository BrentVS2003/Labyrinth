package Labyrinth;

public class Board  {
    private int[][] boardSize;
    private int[][] space;

    public Board(int[][] boardSize, int[][] space) {
        this.boardSize = boardSize;
        this.space = space;
    }

    public int[][] getBoardSize() {
        return boardSize;
    }

    public static void getPosition(){
    }
}
