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
public class VolcanoRobot {
    public VolcanoRobot() {
    }
    String status;
    int speed;
    float temperature;

        void checkTemperature(){
                if(temperature>660){
                status="returning home";
                speed=5;
                }
        }

        void showAttributes(){
                System.out.println("Status: "+status);
                System.out.println("Speed: "+speed);
                System.out.println("Temperature: "+temperature);
        }

}
