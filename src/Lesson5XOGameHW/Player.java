package Lesson5XOGameHW;

import java.util.Scanner;

/**
 * Created by Алина on 18.10.2016.
 */
public class Player implements IShoot {
//TODO Доделать возможность брать координаты игрока с клавиатуры!
//    int getXPlayerCoordinate() {
//        Scanner scanner = new Scanner(System.in);
//        String s =  scanner.nextLine();
//        int XCoordinate = Integer.parseInt(s);
//        return XCoordinate;
//    }
//    int getYPlayerCoordinate() {
//        Scanner scanner = new Scanner(System.in);
//        String s =  scanner.nextLine();
//        int YCoordinate = Integer.parseInt(s);
//        return YCoordinate;
//    }

    @Override
    public Point getShoot() {
        return Point.getRandomCoordinate();
    }
}
