```java
package LaiLorenzo;
import robocode.*;

public class GearHead extends JuniorRobot
{

	public void run() {
		
			setColors(orange, blue, white, yellow, black);

	int north = 0;
	int east = 90;
	}
	public void evadeTactics() {
			turnGunRight(360);
		    turnTo(scannedAngle);
		    turnAheadRight(90, 125);
		    turnAheadLeft(90, 125);
	    }
	
    public void goToCorner () {
			int heightdistance;
			int widthdistance;
			heightdistance = fieldHeight - robotY;
			widthdistance = fieldWidth - robotX;
			turnTo(north);
			ahead(heightdistance);
			turnTo(east);
			ahead(widthdistance);
		}
	public void scanForRobots(){
			turnGunRight(360);
			turnGunTo(scannedAngle);
			if (scannedDistance < 100) {
				fire(3);
			}
		}
	}		
			while(true) {
				switch(evading and moving) {
			    // case 1: Helps to move around and dodge bullets
				case 1:
				turnAheadRight(90, 100);
				break;
				// case 2: Helps to find other robots (others)
				case 2:
				if (others < 15 && others > 5) {
					turnRight(90);
					ahead(250);
				}
				break;
				// case 3: Helps to survive the final stage
				case 3:
				if(others < 5) {
					goToCorner();
					default;
				}			
			}
		}
	}
	public void onScannedRobot() {
		scanForRobots();
		// Helps to save energy and survive longer
		if (energy < 50) {
			doNothing;
		}	
	}
	public void onHitByBullet() {
		evadeTactics();
	}
	public void onHitWall() {
		back(250);
		out.printIn("Ouch!");
	}	
}
```
