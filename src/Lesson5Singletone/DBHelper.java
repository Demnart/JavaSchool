package Lesson5Singletone;

/**
 * Created by Артем on 13.10.2016.
 */
public class DBHelper {
    private static DBHelper instance;

    private DBHelper() {
    }

    public static DBHelper getInstanceOf(){
        if (instance == null) {
            instance = new DBHelper();
        }
        return instance;
    }
}
