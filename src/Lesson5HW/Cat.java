package Lesson5HW;

/**
 * Created by Артем on 16.10.2016.
 */
public class Cat extends Animal {
    @Override
    void eat() {
        System.out.println("Cat eat meat");
    }

    @Override
    void voice() {
        System.out.println("Cat say myau\n");
    }
}
