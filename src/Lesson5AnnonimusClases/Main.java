package Lesson5AnnonimusClases;

import Lesson5Interfaces.IFly;

/**
 * Created by Артем on 14.10.2016.
 */
public class Main {
    // Поля класса
    // Вложенные классы
    class Test2 implements IFly {

        @Override
        public void fly() {

        }

        @Override
        public void landing() {
        }
    }
   static class Main3Builder implements IFly {// Паттерн проэктирование Builder
     static   private int i;

        @Override
        public void fly() {

        }

        @Override
        public void landing() {
        }
    }
    // Методы и конструкторы
    public static void main(String[] args) {

        Main3Builder main3Builder = new Main3Builder();
        Main3Builder.i = 3;
        Main main = new Main();
        Test2 test2 = main.new Test2();

        class Test implements IFly {

            @Override
            public void fly() {

            }

            @Override
            public void landing() {

            }
        }
    }
}
