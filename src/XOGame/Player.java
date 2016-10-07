package XOGame;

import java.util.Scanner;

/**
 * Created by Алина on 06.10.2016.
 */
public class Player {

    int getXCoordinate(){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int xCoord = Integer.parseInt(s);
        return xCoord;
    }

    int getYCoordinate() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int yCoord = Integer.parseInt(s);
        return yCoord;
    }


}
