package Lesson5XOGameHW;

/**
 * Created by Алина on 18.10.2016.
 */
public class Field {
    public enum Type{X,O,Not_Install}
    public static final int SIZE = 3;
    private Type[][] cells = new Type[SIZE][SIZE];

    public Field(){

        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells.length; j++) {
                cells[i][j] = Type.Not_Install;
            }
        }
    }
    public void show() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch (cells[i][j]) {
                    case X:
                        System.out.print("X");
                        break;
                    case O:
                        System.out.print("O");
                        break;
                    case Not_Install:
                        System.out.print(".");
                        break;
                }
            }
            System.out.println();
        }
        System.out.println("\n");
    }
    void getShoot(Point point,Type type){
            cells[point.getX()][point.getY()] = type;

    }

    boolean chekWin(Type type) {
        boolean isWin = false;
        if (cells[0][0] == type && cells[0][1] == type && cells[0][2] == type) {
            isWin = true;
        }
        if (cells[1][0] == type && cells[1][1] == type && cells[1][2] == type) {
            isWin = true;
        }
        if (cells[2][0] == type && cells[2][1] == type && cells[2][2] == type) {
            isWin = true;
        }
        if (cells[0][0] == type && cells[1][0] == type && cells[2][0] == type) {
            isWin = true;
        }
        if (cells[0][1] == type && cells[1][1] == type && cells[2][1] == type) {
            isWin = true;
        }
        if (cells[0][2] == type && cells[1][2] == type && cells[2][2] == type) {
            isWin = true;
        }
        if (cells[0][0] == type && cells[1][1] == type && cells[2][2] == type) {
            isWin = true;
        }
        if (cells[0][2] == type && cells[1][1] == type && cells[2][0] == type) {
            isWin = true;
        }
        return isWin;
    }


}