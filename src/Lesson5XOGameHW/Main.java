package Lesson5XOGameHW;

/**
 * Created by Алина on 18.10.2016.
 */
public class Main {
   static Player player = new Player();
   static Computer computer = new Computer();
   static Field field = new Field();

    public static void main(String[] args) {
        field.show();
        do {
            field.getShoot(computer.getShoot(), Field.Type.X);
            field.show();
            field.chekWin(Field.Type.X);
            field.getShoot(player.getShoot(), Field.Type.O);
            field.show();
            field.chekWin(Field.Type.O);

        }while (false);
    }
}
