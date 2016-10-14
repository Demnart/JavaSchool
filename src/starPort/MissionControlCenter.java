package starPort;

/**
 * Created by Артем on 07.10.2016.
 */
public class MissionControlCenter {
    Flyable starShip;

    public MissionControlCenter(Flyable starShip) {
        this.starShip = starShip;
    }

    void launch() {
        System.out.println("ЦУП разрешает вылет");
        for (int i = 10; i >= 0; i--) {
            System.out.println("До запуска осталось " + i + "секунд");
        }
        System.out.println("Успешный запуск");
    }
}
