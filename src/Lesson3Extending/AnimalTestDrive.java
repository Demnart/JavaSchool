package Lesson3Extending;

/**
 * Created by Артем on 10.10.2016.
 */
public class AnimalTestDrive {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Cat();//Восходящее преобразование
        animals[1] = new Croco();
        animals[2] =  new Dog();
        animals[3] = new Fox();
        //Animal
        // ^
        // |
        //Cat

        for (Animal animal : animals) {
            animal.voice();
            if (animal instanceof Cat) {
                ((Cat) animal).destroiSofa();// Нисходящее преобразование
                //Animal
                // |
                // V
                //Cat
            }
        }
    }
}
