package Lesson5HWATM;

/**
 * Created by Артем on 19.10.2016.
 */
public interface IAtm {
    void insertCard(ICard iCard);
    void eject();
    void withDraw(int ammount);
    void getBalance();
}
