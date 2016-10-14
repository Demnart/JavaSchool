package Lesson5AnnonimusClases;

import Lesson5Interfaces.IFly;

/**
 * Created by Артем on 14.10.2016.
 */
public class Main2 {
    public static void main(String[] args) {

        class Test implements IFly {

            @Override
            public void fly() {

            }

            @Override
            public void landing() {

            }
        }
        Test test = new Test();
    }
}
