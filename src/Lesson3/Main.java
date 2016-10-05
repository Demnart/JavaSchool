package Lesson3;

/**
 * Created by Артем on 05.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            if (i == 5) {
             break;
            }

            /**
             * Если написать такой код то после того как i  станет равен 3 данный цикл будет бесконечен т.к. i  не будет инкрементироваться
            if (i == 3) {
                continue; Данная команда отправляет нас к началу цикла while(); или любого другого цикла в котором будет написана
            */}
            System.out.println(i);
            i++;
        }
    }

