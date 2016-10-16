package Lesson5HW;

/**
 * Created by Артем on 16.10.2016.
 */
public class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("Dog eat bone");
    }

    @Override
    void voice() {
        System.out.println("Dog say Bark - bark\n");
    }
}
