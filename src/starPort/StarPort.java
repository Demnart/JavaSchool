package starPort;

/**
 * Created by Артем on 07.10.2016.
 */
public class StarPort {
    String  name;
    MissionControlCenter missionControlCenter;
    Flyable starShip;

    public StarPort(String name, MissionControlCenter missionControlCenter, Flyable starShip) {
        this.name = name;
        this.missionControlCenter = missionControlCenter;
        this.starShip = starShip;
    }
    public StarPort(){

    }
}


