package Lesson6SetCollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;

/**
 * Created by Артем on 19.10.2016.
 */
public class SetTestDrivr {
    public static void main(String[] args) {
        Set set ;
        set = new HashSet();
//      set = new LinkedHashSet();
        //При установке в коллекцию выбрасывает все дубликаты и устанавливает все значения не по порядку, а в разброс
        set.add("HHDS");
        System.out.println(set.add("Hello"));
        System.out.println(set.add("Hello"));
        set.add("Hello");
        set.add("Hello");
        set.add("H");
//        set.
        System.out.println(set);
    }
}
