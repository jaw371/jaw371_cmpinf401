package lab2;

import javax.swing.JOptionPane;

public class decomposingMoney {

	public static void main(String[] args) {
		//ask for user input
		String amount = JOptionPane.showInputDialog(null,"Please enter a number between 1 and 9999:");
		int a = Integer.parseInt(amount);{
			//calculate and print
			int b = a/1000;
			int c = a%1000;
			int e = c/100;
			int f = c%100;
			int g = f/10;
			int h = f%10;
			int i = h/1;
			JOptionPane.showMessageDialog(null, +b+ " grands" +'\n' + e + " Benjamins" + '\n' + g + " sawbucks" + '\n' + i + " bucks");
					
					
			

	}
	}


}
