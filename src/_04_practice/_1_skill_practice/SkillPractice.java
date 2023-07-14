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
	for(int i=1; i<=30;i+=2) {
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
	int cars = 2;
	if(cars == 0) {
		JOptionPane.showMessageDialog(null,"I bet you use public transportation.");
	}
	if(cars ==1) {
	
	}
}
}
