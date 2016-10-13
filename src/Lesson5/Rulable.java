package Lesson5;

/**
 * Created by Артем on 13.10.2016.
 */
public interface Rulable {
    void turnLeft();
    void turnRight();
    void stop();
    void speedUp();

    void setGear(int gear);

    int getGear();
}
