package Lesson5HW;

/**
 * Created by Артем on 16.10.2016.
 */
public class Main {
   static Bat bat = new Bat();
   static Eagle eagle = new Eagle();
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        getAnimal(animals);
        getAnimalLife(animals);
        getFlyableAnimal(bat, eagle);
        }

    private static void getAnimalLife(Animal[] animals) {
        for (Animal animal : animals) {
            animal.sleep();
            animal.eat();
            animal.voice();
        }
        }

    private static void getFlyableAnimal(Bat bat, Eagle eagle) {
        eagle.fly();
        bat.fly();
    }

    private static void getAnimal(Animal[] animals) {
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Bat();
        animals[3] = new Eagle();
    }
}
