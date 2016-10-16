package Lesson5HW;

/**
 * Created by Артем on 16.10.2016.
 */
public class Bat extends Animal implements IFly {
    @Override
    public void fly() {
        System.out.println("I am a Bat,and I can Fly");
    }

    @Override
    void eat() {
        System.out.println("Bat eat blood!!");
    }

    @Override
    void voice() {
        System.out.println("Some voice that we can listen\n");
    }
}
