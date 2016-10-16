package Lesson5HW2;

/**
 * Created by Артем on 16.10.2016.
 */
public class Spaceport {
    String name;
    IFly somthingThatCanFly;
    MissionControlCenter missionControlCenter;

//    public Spaceport() {
//    }

    public Spaceport(String name, IFly somthingThatCanFly, MissionControlCenter missionControlCenter) {

        this.name = name;
        this.somthingThatCanFly = somthingThatCanFly;
        this.missionControlCenter = missionControlCenter;
    }
}
