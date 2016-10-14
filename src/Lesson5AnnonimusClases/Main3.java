package Lesson5AnnonimusClases;

import Lesson5Interfaces.IFly;

/**
 * Created by Артем on 14.10.2016.
 */
public class Main3 {
    public static void main(String[] args) {

     IFly iFly = new IFly() {// класс без имени. Анонимный внутренний класс

            @Override
            public void fly() {

            }

            @Override
            public void landing() {

            }
        };
//        Test test = new Test();
    }
}
