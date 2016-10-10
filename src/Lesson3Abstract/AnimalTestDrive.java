package Lesson3Abstract;

/**
 * Created by Артем on 10.10.2016.
 */
public class AnimalTestDrive {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Cat();
        animals[1] = new Croco();
        animals[2] =  new Dog();
        animals[3] = new Fox();

        for (Animal animal : animals) {
            animal.voice();
        }
    }
}
