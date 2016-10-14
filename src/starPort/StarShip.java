package starPort;

/**
 * Created by Артем on 07.10.2016.
 */
public class StarShip implements Flyable {
    Pilot pilot;

    public StarShip(Pilot pilot) {
        this.pilot = pilot;
    }

    public StarShip() {
    }

    public void launch(){
        System.out.println("Все двигатели запущены");
        System.out.println("Взлет с пилотом " + pilot.name);
    }

    void after60Seconds(){
        System.out.println(" Полет 60 секунд нормально!!!");
    }
}
