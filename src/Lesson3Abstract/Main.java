package Lesson3Abstract;

/**
 * Created by Артем on 10.10.2016.
 */
public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal(); не возможно создать экземпляр класса т.к. он обьявлен как абстактный класс
        Cat cat = new Cat();
        System.out.println(cat.name);
        cat.voice();
        Dog dog = new Dog();
        dog.name = "Sharik";
        System.out.println(dog.name);
        dog.voice();

        Animal animal;
        animal = new Dog();
    }
}
