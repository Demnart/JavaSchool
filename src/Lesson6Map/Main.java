package Lesson6Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Created by Артем on 19.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Map<Integer, Character> map;
        map = new HashMap<Integer, Character>();
        map.put(0, 'X');
        map.put(1, 'O');
        map.put(2, 'X');
        map.put(2, 'Y');// В отличии от других map перезатрет старое значение ключа и установит новое
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.hashCode());


        Map<String, Person> mapName = new HashMap();
        mapName.put("friend", new Person("Ilia", 14));
        mapName.put("friends", new Person("Ilia2", 17));
        mapName.put("vip", new Person("Ilia3", 20));

        System.out.println(mapName.get("vip").name);
        for (Person person : mapName.values()) {
            System.out.println(person.name);
        }

        Map<Person, String> targetPerson = new HashMap<>();
        targetPerson.put(new Person("Tom", 23),"Friend");
        targetPerson.put(new Person("Mya", 27),"Vip");
        targetPerson.put(new Person("Timon", 29),"Nope");
        targetPerson.put(new Person("TT", 13),"Girlfriend");

        System.out.println(new HashSet<String >(targetPerson.values()));
        System.out.println(targetPerson.values());
        for (Map.Entry<Person, String> personStringEntry : targetPerson.entrySet()) {
            if (personStringEntry.getValue().equals("Friend")) {
                System.out.println(personStringEntry.getKey().name);
            }
        }
    }

}
