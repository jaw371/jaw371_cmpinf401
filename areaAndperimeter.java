package lab2;

import javax.swing.JOptionPane;

public class areaAndperimeter {
	private static int p = 0;
	private static int a = 0;
	public static void main(String[]args) {
		//ask for user input
	String radius = JOptionPane.showInputDialog(null,"Please enter the radius of the circle:");
	//convert string to double
	double r = Double.parseDouble(radius);{
		//calculate, round, and print
	p = (int) (2*Math.PI*r);
	a = (int) (Math.PI*r*r);
	}
	double roundOff1 = Math.round(r*100)/100;
	double roundOff2 = Math.round(p*100)/100;
	double roundOff3 = Math.round(a*100)/100;


	JOptionPane.showMessageDialog(null,
			"The circle with radius " +roundOff1+ " has an area of " +roundOff2+ " and a perimeter of " +roundOff3);
	}
}
	



