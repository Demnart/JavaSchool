package Lesson3Abstract;

/**
 * Created by Артем on 10.10.2016.
 */
//public class Cat теперь потомок Animal
//public  class Cat расширяет Animal
//public class Cat extends Feline,JFrame {//  Множественное наследование запрещено!
public class Cat extends Feline {// подкласс,потомок, дочерний
    String nails;
    void destroiSofa(){
        System.out.println("Sofa was destroed");
    }
}
