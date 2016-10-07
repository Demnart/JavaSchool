package starPort;

/**
 * Created by Артем on 07.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Pilot pilot = new Pilot("Юрий");
        StarShip starShip = new StarShip(pilot);
        StarPort starPort = new StarPort("Байконур",new MissionControlCenter(starShip), starShip);
        starPort.starShip.launch();
        starPort.missionControlCenter.launch();
        starPort.starShip.after60Seconds();
    }
}
