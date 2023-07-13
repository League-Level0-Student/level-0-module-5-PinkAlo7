import javax.swing.JOptionPane;

public class SkillPractice {
public static void main(String[] args) {
SkillPractice skills = new SkillPractice();
	skills.skill1();
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

}
