package lab2;

import javax.swing.JOptionPane;

public class part1 {
	
	
	public static void main(String[]args) {
		//ask for user input
		String a = JOptionPane.showInputDialog("Please enter a number");
		String b = JOptionPane.showInputDialog("Please enter another number");
		//convert strings to doubles
		double z = Double.parseDouble(a);
		double x = Double.parseDouble(b);
		//solve and round, then print
		double c = Math.sqrt(Math.pow(z,2)+Math.pow(x, 2));
		double roundOff = Math.round(c*100)/100;
		JOptionPane.showMessageDialog(null,"The hypotenuse is: "+roundOff);

		}
			
	
}


	
	
		
	



