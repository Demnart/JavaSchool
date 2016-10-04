package Lesson2XO;

/**
 * Created by Артем on 05.10.2016.
 */
public class Main {
    private static final int SIZES = 3;
    private char[][] field = new char[SIZES][SIZES];

    public void createBoard() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = '*';

            }
        }
      //TODO Сделать возможность вывода вместе с таблицой
//        System.out.printf(" _ _ _\n");
//        System.out.printf("|_|_|_|\n");
//        System.out.printf("|_|_|_|\n");
//        System.out.printf("|_|_|_|\n");
    }

    public void showBoard() {
        for (char[] chars : field) {
            System.out.println(chars);

        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.createBoard();
        main.showBoard();
    }
}
