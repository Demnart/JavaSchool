package Lesson3AdvancedXO;

/**
 * Created by Артем on 05.10.2016.
 */
public class Board {
    public static final int SIZE = 3;
    private final char[][] board = new char[SIZE][SIZE];

        void initBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = Figure.defaultFigure;
            }
        }
    }

    void showBoard(){
        for (char[] chars : board) {
            System.out.println(chars);
        }
    }


}
