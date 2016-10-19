package Lesson6ListArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Артем on 19.10.2016.
 */
public class ListTestDrive {
    public static void main(String[] args) {
//        List<String > personses =new ArrayList<String >();
        List<Person> personses = new ArrayList<Person>();
        Person person = new Person();
        person.age = 1000;
        person.name = "Tom";
        personses.add(person);
        personses.add(new Person("Tom", 1));

//        personses.add("Monkey");
//        personses.add(1000);Так делать не желаетельно

    }
}
