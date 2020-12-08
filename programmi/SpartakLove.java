package programmi;
import robocode.*;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/JuniorRobot.html

/**
 * SpartakLove - a robot by (your name here)
 */
public class SpartakLove extends JuniorRobot
{

	public void run() {

        while(true) {
         turnGunRight(10); 
		 turnLeft(-10);    
        }
    }
//Dodging virker 80% af tiden, dog misser den på robotter som bevæger sig.
    public void onScannedRobot() {
	   ahead(0);
       fire(2);
	   back(75);
       ahead(75);
       }

    public void onHitByBullet() {

//Mindre problem her (nedenunder forklaring)
		turnAheadLeft(250, 180 - hitByBulletBearing);
    }
    
//Der er et problem her, da den nogle gange ved højre side af banen står stille, da den turner mod muren
    public void onHitWall() {

		turnAheadRight(300, 90 - hitByBulletBearing);
    }    
}