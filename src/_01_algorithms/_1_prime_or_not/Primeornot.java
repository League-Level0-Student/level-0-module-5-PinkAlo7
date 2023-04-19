package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class Primeornot {
	public static void main(String[] args) {
		String number = JOptionPane.showInputDialog("Please enter a number");
		int numbers = Integer.parseInt(number);
		for (int i = 2; i < numbers; i++) {
			if (numbers % i == 0) {
				JOptionPane.showMessageDialog(null, "Your number is not a prime number");
				System.exit(0);
			} 

			}
    JOptionPane.showMessageDialog(null,"Your number is prime!");
		}
	}

