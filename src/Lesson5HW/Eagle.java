package Lesson5HW;

/**
 * Created by Артем on 16.10.2016.
 */
public class Eagle extends Animal implements IFly {
    @Override
    public void fly() {
        System.out.println("I am an Eagle and I can fly");
    }

    @Override
    void eat() {
        System.out.println("I can eat and meat and plants");
    }

    @Override
    void voice() {
        System.out.println("My voice is the best\n");
    }
}
