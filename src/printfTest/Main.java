package printfTest;

/**
 * Created by Артем on 07.10.2016.
 */
public class Main {

    public static final int SIZE = 3;

    public static void main(String[] args) {
        char[][] cells = new char[SIZE][SIZE];

        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells.length; j++) {
                cells[i][j] = '!';
            }
        }

//
//        for (char[] cell : cells) {
//            System.out.println(cell);
//        }
//
//
//
//        for (int i = 0; i < cells.length; i++) {
//
//            if (i == 2) {
//                System.out.printf("%d   |  |  \n",i);
//            }
//        }
        System.out.printf("   %d % d  %d\n",0,1,2);
        for (int i = 0; i < cells.length; i++) {
            System.out.printf("%d __|__|__ \n " ,i);
            for (int j = 0; j < cells.length; j++) {
            }

        }




    }
}
