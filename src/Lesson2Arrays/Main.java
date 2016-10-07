package Lesson2Arrays;

/**
 * Created by Алина on 04.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        char[][] cells = new char[3][3];

        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells.length; j++) {
                cells[j][i] = '.';
            }
        }

        for (char[] cell : cells) {
            System.out.println(cell);
        }

    }

}
