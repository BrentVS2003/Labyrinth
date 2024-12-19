package Labyrinth;

import java.time.LocalDateTime;

public class GameSession {
    private LocalDateTime time;
    private LocalDateTime maxTime;

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public void setMaxTime(LocalDateTime maxTime) {
        this.maxTime = maxTime;
    }

    public static void calculateTime(){
    }
}
