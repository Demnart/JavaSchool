package Lesson5HW2;

/**
 * Created by Артем on 16.10.2016.
 */
public class MissionControlCenter {
IFly iFly;

    public MissionControlCenter(IFly iFly) {
        this.iFly = iFly;
    }

    void launch(){
        for (int i = 10; i > 0; i--) {
            System.out.println("Цуп разрешает взлет через : " + i + " секунд");
        }
    }
}
