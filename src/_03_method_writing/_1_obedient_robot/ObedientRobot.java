package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot rob = new Robot();
public static void main(String[] args) {

int shape = JOptionPane.showOptionDialog(null,"Which shape would you like the robot to draw?","Obedient Robot",0,
		JOptionPane.INFORMATION_MESSAGE, null,new String[] {"Square", "Triangle", "Circle"}, null);
int color = JOptionPane.showOptionDialog(null,"Which color do you want the shape?", "Obedient Robot",0,
		JOptionPane.INFORMATION_MESSAGE, null,new String[] {"Red", "Yellow", "Blue", "Green", "Purple"},null);
if(color == 0) {
	rob.setPenColor(235,9,9);
}
if(color == 1) {
	rob.setPenColor(235,212,9);
}
if(color == 2) {
	rob.setPenColor(24,9,235);
}
if(color == 3) {
	rob.setPenColor(9,235,17);
}
if(color == 4) {
	rob.setPenColor(171,9,235);
}

if(shape == 0) {
	drawSquare();
}
if(shape == 1) {
	drawTriangle();
}
if(shape == 2) {
	drawCircle();
}
	
}

static void drawSquare() {
	rob.penDown();
	rob.setSpeed(20);
	for(int i=0; i<=3; i++) {
	rob.move(200);
	rob.turn(90);
	}
	}
static void drawTriangle() {
	rob.penDown();
	rob.setSpeed(20);
	for(int i=0; i<3;i++) {
		rob.turn(120);
		rob.move(200);
	}
}
static void drawCircle() {
	rob.penDown();
	rob.setSpeed(100);
	for(int i=1; i<=360; i++) {
	rob.turn(1);
	rob.move(2);
	}
	
	
}
}
