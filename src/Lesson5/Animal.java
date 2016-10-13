package Lesson5;

/**
 * Created by Артем on 13.10.2016.
 */
public abstract class Animal {
    abstract void voice();// для поддержки полиморфизма
    final void sleep(){// Запрет наследования
        System.out.println("ZZZZ");
    }
}
