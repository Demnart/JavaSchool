package Lesson5HWATM;

/**
 * Created by Артем on 19.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        IAtm serena = new Atm();
        ICard masterCard = new MasterCard(1000, "Igor");

        serena.insertCard(masterCard);
        serena.getBalance();
        serena.withDraw(800);
        serena.withDraw(900);
        serena.getBalance();
    }
}
//GOF patterns