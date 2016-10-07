package Lesson3AdvancedXO;

import java.util.Scanner;

/**
 * Created by Артем on 05.10.2016.
 */
public class Player {

     int getShoot() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты куда желаете установить фигуру");
        String s = scanner.nextLine();
        int coord = Integer.parseInt(s);
        return coord;
    }
}
