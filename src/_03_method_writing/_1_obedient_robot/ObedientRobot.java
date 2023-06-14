package _03_method_writing._1_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
public static void main(String[] args) {
	Robot rob = new Robot();
	for(int i=1; i<=4; i++)
	rob.penDown();
	rob.setSpeed(20);
	rob.move(200);
	rob.turn(90);
	
}
}
