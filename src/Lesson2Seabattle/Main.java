package Lesson2Seabattle;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Артем on 05.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        gameCicle(main);
        createShips();
        showWinner();

    }

    private static void showWinner() {
        Random random = new Random();
        int i = 1 + random.nextInt(2);
        System.out.println("Наш победитель/ца под номером : " + i);
    }

    private static void createShips() {
        Ship[] ships = new Ship[10];
        for (int i = 0; i < ships.length; i++) {
            ships[i] = new Ship();
        }
        System.out.println("Все корабли созданы");
    }

    private static void gameCicle(Main main) {
        System.out.println("Добро пожаловать в игру морской бой");
        System.out.println("Введите Ваш Никнейм/Имя");
        main.getPlayerNameOrNickName();
    }

    public String getPlayerNameOrNickName() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        return s;
    }
}
