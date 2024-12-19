package Labyrinth;

public class Player {
    private int positionX;
    private int positionY;
    private int highscore;
    private String name;

    public Player(int positionX, int positionY, int highscore, String name) {
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
}
