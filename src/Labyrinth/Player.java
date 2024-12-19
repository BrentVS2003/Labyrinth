package Labyrinth;

public class Player extends Board {
    private int positionX;
    private int positionY;
    private int highscore;
    private String name;

    public Player(int[][] boardSize, int[][] space, int positionX, int positionY, int highscore, String name) {
        super(boardSize, space);
        this.positionX = positionX;
        this.positionY = positionY;
        this.highscore = highscore;
        this.name = name;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public static void move(){
    }
}
