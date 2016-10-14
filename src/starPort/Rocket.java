package starPort;

/**
 * Created by Артем on 14.10.2016.
 */
public class Rocket implements Flyable {

    String sputnik;

    public Rocket(String sputnik) {
        this.sputnik = sputnik;
    }

    @Override
    public void launch() {
        System.out.println("Rocket is launch " + sputnik);
    }
}
