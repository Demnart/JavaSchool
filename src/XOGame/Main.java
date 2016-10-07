package XOGame;

/**
 * Created by Алина on 06.10.2016.
 */
public class Main {
 private   static Figure figure = new Figure();
 private   static Player player = new Player();
 private   static Board board = new Board();

    public static void main(String[] args) {
        board.initCells();
        gameCicle();
    }

    private static void gameCicle() {
        do {
            System.out.println("Введите ваши координаты,учтите что верхняя левая ячейка имеет координаты 0,0, а нижняя правая 2,2");
            int xCoord = player.getXCoordinate();
            int yCoord = player.getYCoordinate();
            System.out.printf("Ваши координаты %d\t%d\n",xCoord,yCoord);
            board.setPlayerFigure(xCoord,yCoord);
            board.showCells();
        }while(board.isGameNotOver());
    }
}
