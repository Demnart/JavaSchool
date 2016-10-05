package Lesson2Seabattle;

import java.util.Random;

/**
 * Created by Артем on 05.10.2016.
 */
public class Ship {
    private int size;
    private int startPosition;
    private int endPosition;


    public void setBiggestShip() {
        size = 4;
        Random random = new Random();
        startPosition = 1 + random.nextInt(9);
        endPosition = startPosition + size;
    }

    public void setBigShip() {
        size = 3;
        for (int i = 0; i < 2; i++) {
            Random random = new Random();
            startPosition = 1 + random.nextInt(9);
            endPosition = startPosition + size;
        }
    }

    public void setMiddleShip() {
        size = 2;
        for (int i = 0; i < 3; i++) {
            Random random = new Random();
            startPosition = 1 + random.nextInt(9);
            endPosition = startPosition + size;
        }
    }

    public void setSmallShip() {
        size = 1;
        for (int i = 0; i < 4; i++) {
            Random random = new Random();
            startPosition = 1 + random.nextInt(9);
            endPosition = startPosition + size;
        }
    }
}
