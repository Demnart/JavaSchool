package Lesson3Abstract;

/**
 * Created by Артем on 10.10.2016.
 */
public class Dog extends Animal {// подкласс,потомок, дочерний


    @Override// Аннотация, Защита от опечаток в названии метода
    void voice() {// переопределение родительского метода
        System.out.println("gav,bark,wow-wow");
        System.out.print("Обращаемся к предку");
        super.voice();
    }
}
