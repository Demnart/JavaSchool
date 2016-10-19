package Lesson5HWATM;

/**
 * Created by Артем on 19.10.2016.
 */
public class Atm implements IAtm {
    private ICard card;




    @Override
    public void insertCard(ICard iCard) {
        card = iCard;
    }

    @Override
    public void eject() {
        card = null;
        System.out.println("Card was ejected");
    }

    @Override
    public void withDraw(int ammount) {
        if (card.withDraw(ammount)) {
            System.out.println("Cash :" + ammount + "new Balance :" + card.balance());

        } else {
            System.out.println("Not enough money");
        }
    }

    @Override
    public void getBalance() {
        System.out.println("Balance :" + card.balance());
    }
}
