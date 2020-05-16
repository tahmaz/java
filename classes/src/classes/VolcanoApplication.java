package classes;

/**
 * <p>Title: </p>
 *
 * <p>Description: </p>
 *
 * <p>Copyright: Copyright (c) 2008</p>
 *
 * <p>Company: </p>
 *
 * @author not attributable
 * @version 1.0
 */
public class VolcanoApplication {
    public VolcanoApplication() {
    }
    public static void main(String[] arguments){
                VolcanoRobot dante=new VolcanoRobot();
                dante.status="exploring";
                dante.speed=2;
                dante.temperature=510;

                dante.showAttributes();
                System.out.println("Increasing speed to 3");
                dante.speed=3;
                dante.showAttributes();
                System.out.println("Changing temperature to 670");
                dante.temperature=670;
                dante.showAttributes();
                System.out.println("Changing the temperature.");
                dante.checkTemperature();
                dante.showAttributes();
                }

}
