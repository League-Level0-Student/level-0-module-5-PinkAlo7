package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
public static void main(String[] args) {

int shape = JOptionPane.showOptionDialog(null,"Which shape would you like the robot to draw?","Obedient Robot",0,
		JOptionPane.INFORMATION_MESSAGE, null,"Square")

	
}
}
static void drawSquare() {
	Robot rob = new Robot();
	rob.penDown();
	rob.setSpeed(20);
	for(int i=0; i<=3; i++) {
	rob.move(200);
	rob.turn(90);
	}
	}
static void drawTriangle() {
	Robot rob = new Robot();
	rob.penDown();
	rob.setSpeed(20);
	for(int i=0; i<3;i++) {
		rob.turn(120);
		rob.move(200);
	}
}
static void drawCircle() {
	Robot rob = new Robot(); 
	rob.penDown();
	rob.setSpeed(100);
	for(int i=1; i<=360; i++) {
	rob.turn(1);
	rob.move(2);
	}
	
	
}
}
