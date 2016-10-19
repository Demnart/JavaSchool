package Lesson6ListArrayList;

import java.util.*;

/**
 * Created by Артем on 19.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Collection collection;// Главный интерфейс
        List<String > list;//упорядочен,допускаються дубликаты
        Set set;// НЕ упорядочен,дубликатов не может быть
        Queue queue;


        Map map;//ключ->значению.Сопоставление
        //cells[0] = 'X'//0->'X';

//        list = new ArrayList<>();// массив
        list = new LinkedList();

        list.add("HHDS");
        list.add("Hello");
        list.add("Hello");
        list.add("Hello");
        list.add("Hello");
        list.add("H");
//        list.add(1);
        System.out.println(list);

        System.out.println(list.get(4));
        System.out.println(list.lastIndexOf("Hello"));
//        list.remove(1);
        Collections.sort(list);

    }

}
