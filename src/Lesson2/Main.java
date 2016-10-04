package Lesson2;

import java.util.Random;

/**
 * Created by Артем on 04.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[10];

        for (int i = 0; i < cats.length; i++) {
            Random random = new Random();
            cats[i] = new Cat();
             cats[i].name = "Murrrka" + i;
            cats[i].age = 1 + random.nextInt(9);


        }
    }
}
