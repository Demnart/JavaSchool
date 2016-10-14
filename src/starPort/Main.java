package starPort;

/**
 * Created by Артем on 07.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Pilot pilot = new Pilot("Юрий");
        StarShip starShip = new StarShip(pilot);
        Rocket rocket = new Rocket("super sputnik");
        StarPort starPort = new StarPort("Байконур",new MissionControlCenter(starShip), starShip);
        starPort.starShip.launch();
        starPort.missionControlCenter.launch();
        StarPort starPort1 = new StarPort("Изида",new MissionControlCenter(rocket),rocket);
        starPort1.starShip.launch();
        starPort.missionControlCenter.launch();
    }
}
