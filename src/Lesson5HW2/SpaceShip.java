package Lesson5HW2;

/**
 * Created by Артем on 16.10.2016.
 */
public class SpaceShip implements IFly {
    String nameOfRocket;
    Pilot pilot;

    public SpaceShip() {
    }

    public SpaceShip(String nameOfRocket, Pilot pilot) {
        this.nameOfRocket = nameOfRocket;
        this.pilot = pilot;
    }

    @Override
    public void fly() {
        System.out.println("Космический корабль запущен с пилотом "  + pilot.getName());
    }
}
