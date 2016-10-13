package Lesson5Singletone;

/**
 * Created by Артем on 13.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        DBHelper dbHelper = DBHelper.getInstanceOf();
        DBHelper dbHelper1 = DBHelper.getInstanceOf();
    }
}
