package XOGame;

/**
 * Created by Алина on 06.10.2016.
 */
public class Board {
    public static final int SIZE = 3;
    private final char[][] cells = new char[SIZE][SIZE];

    void initCells(){
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells.length; j++) {
                cells[i][j] = Figure.deffultFigure;
            }
        }
    }

    void showCells(){
        for (char[] cell : cells) {
            System.out.println(cell);
        }
    }

    void setPlayerFigure(int x, int y) {
        cells[x][y] = Figure.FigureX;
    }
    boolean isGameNotOver() {
        return false;
    }
}
