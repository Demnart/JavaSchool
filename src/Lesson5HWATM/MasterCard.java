package Lesson5HWATM;

/**
 * Created by Артем on 19.10.2016.
 */
public class MasterCard implements ICard {
    private int uin;

    public MasterCard( int ammount, String cardHolerGame) {
        this.ammount = ammount;
        this.cardHolerGame = cardHolerGame;
    }

    private int ammount;
    private String cardHolerGame;


    @Override
    public int balance() {
        return ammount;
    }

    @Override
    public boolean withDraw(int ammaunt) {
        if (ammaunt <= this.ammount) {
            this.ammount -= ammaunt;
            return true;
        } else {
            return false;

        }
    }
}
