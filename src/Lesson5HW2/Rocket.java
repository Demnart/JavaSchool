package Lesson5HW2;

/**
 * Created by Артем on 16.10.2016.
 */
public class Rocket implements IFly {
    private String classOfRocket;

    @Override
    public void fly() {
        System.out.println("Ракета запущена");
    }
}
