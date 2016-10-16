package Lesson5HW2;

/**
 * Created by Артем on 16.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Pilot pilot = new Pilot("Юрий");
        SpaceShip spaceShip = new SpaceShip("Буран", pilot);
        Rocket rocket = new Rocket();
        Spaceport spaceport = new Spaceport("Байконур", spaceShip, new MissionControlCenter(spaceShip));
        spaceport.missionControlCenter.launch();
        spaceport.missionControlCenter.iFly.fly();

        Spaceport spaceport1 = new Spaceport("Мыс Канаверал", rocket, new MissionControlCenter(rocket));
        spaceport1.missionControlCenter.launch();
        spaceport1.missionControlCenter.iFly.fly();

    }
}
