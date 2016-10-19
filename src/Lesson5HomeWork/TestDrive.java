package Lesson5HomeWork;

/**
 * Created by Артем on 19.10.2016.
 */
public class TestDrive {
    public static void main(String[] args) {
        /**
         * По сути не возможно создать экземпляр интерфейса
         * Однако возможно создать внутренний класс без имени который будет реализововать
         * Методы интерфейса
         */
        Inter inter = new Inter() {
            @Override
            public void longN() {

            }
        };
    }
}
