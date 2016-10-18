package Lesson5XOGameHW;

/**
 * Created by Алина on 18.10.2016.
 */
public class Computer implements IShoot {
    @Override
    public Point getShoot() {
        return Point.getRandomCoordinate();
    }
}

