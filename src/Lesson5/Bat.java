package Lesson5;

/**
 * Created by Артем on 13.10.2016.
 */
public class Bat extends Animal implements IFly {
    @Override
    void voice() {
        System.out.println("iiiiii");
    }

    @Override
    public void fly() {

    }

    @Override
    public void landing() {

    }
}
