package _04_practice._1_skill_practice;
import javax.swing.JOptionPane;

public class SkillPractice {
public static void main(String[] args) {
SkillPractice skills = new SkillPractice();
	skills.skill1();
	skills.skill2();
	skills.skill3();
	skills.skill4();
}
void skill1() {
	String dime = JOptionPane.showInputDialog("How many dimes do you have?");
	int dimes = Integer.parseInt(dime);
	int dimes10 = dimes*10;
	JOptionPane.showMessageDialog(null, "You have "+dimes10+" cents.");
	String length = JOptionPane.showInputDialog("How many inches tall are you?");
	int height = Integer.parseInt(length);
	if (height < 36) {
		JOptionPane.showMessageDialog(null, "Eat your Wheaties.");
	}
		else {
			JOptionPane.showMessageDialog(null,  "You are tall");
		}
	}
void skill2() {
	for(int i=0; i<=30;i+=3) {
		System.out.println(i);
	}
}

void skill3() {
	System.out.println("/////////////////////////////////////////");
	System.out.println(2);
	System.out.println(9);
	int difference = 9-2; 
	JOptionPane.showMessageDialog(null, "The difference between those numbers is "+difference+".");
}
void skill4() {
	String city = JOptionPane.showInputDialog("What city do you live in?");
	if(city.equalsIgnoreCase("San Diego")){
		JOptionPane.showMessageDialog(null, "You live in America's Finest City.");   
	}else {
		JOptionPane.showMessageDialog(null,"Move to San Diego.");
	}
	
  int cars = 3;
	if(cars == 0) {
		JOptionPane.showMessageDialog(null,"I bet you use public transportation.");
	}
	if(cars == 1) {
		JOptionPane.showMessageDialog(null, "Honda");
	}
	if(cars > 1) {
		JOptionPane.showMessageDialog(null, "All of my cars together have 28 wheels");
		}
	String school = JOptionPane.showInputDialog("What school do you go to?");
	if(school.equalsIgnoreCase("homeschool") || school.equalsIgnoreCase("I homeschool") || school.equalsIgnoreCase("I home school") || school.equalsIgnoreCase("home school"))  {
		JOptionPane.showMessageDialog(null,"You homeschool?! I homeschool too! That's awsome!");
	}else {
	JOptionPane.showMessageDialog(null,school+" is a fantastic school!");
	
}

}
}

































