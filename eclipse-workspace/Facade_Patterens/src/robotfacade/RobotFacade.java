package robotfacade;

import robotparts.RobotBody;
import robotparts.RobotColor;
import robotparts.RobotMetal;

public class RobotFacade {
	RobotBody rb;
	RobotMetal rm;
	RobotColor rc;
	
	
	public RobotFacade() {
		rb = new RobotBody();
		rm = new RobotMetal();
		rc = new RobotColor();
	}
	
	public void ConstructRobot(String color, String metal) {
		System.out.println("\n Creation of the Robot Start");
		rc.SetColor(color);
		rm.SetMetal(metal);
		rb.CreateBody();
		System.out.println("\n Robot Creation End");
		System.out.println("");
		
	}
}
