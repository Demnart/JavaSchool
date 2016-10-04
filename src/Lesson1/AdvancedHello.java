package Lesson1;

import java.util.Scanner;

/**
 * Created by Артем on 04.10.2016.
 */
public class AdvancedHello {

    public static void main(String[] args) {
        System.out.println("Введите количество разбойников");
        int count = Integer.parseInt(new Scanner(System.in).nextLine());// Преобразуем строку в целочисленное число та же запись только в более длинном варианте
        //Scanner scanner = new Scanner(System.in); Создаем ссылочную переменную типа сканнер, а так же передаем конструктору Scanner аргумент System.in;
        //String s = nextLine(); присваеваем переменной строки значение которое было введено с клавиатуры
        //int count = Integer.parseInt(scanner); преобразуем полученное значение в целое число и присваеваем его переменной count;

        String hello = "Здравствуй разбойник";
        helloBandit(count, hello);
    }

    private static void helloBandit(int count, String hello) {
        for (int i = 1; i < count; i++) {
            System.out.println(hello + i);
        }
    }
}
