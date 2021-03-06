package Lesson5XOGameHW;

import java.util.Random;

/**
 * Created by Алина on 18.10.2016.
 */
public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public static Point getRandomCoordinate() {
        return new Point(new Random().nextInt(3),new Random().nextInt(3));
    }
}
