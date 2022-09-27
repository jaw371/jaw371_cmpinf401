import javax.swing.JOptionPane;
public class Logarithm {

	public static void main(String[]args) {
			int x = 0; 
			int base = 0;
			
			
	do{
		x = Integer.parseInt(JOptionPane.showInputDialog("Please Enter a Number Greater Than 0 to Calculate the log:"));
		base = Integer.parseInt(JOptionPane.showInputDialog("Please Enter a Number Greater Than 1 for the Base:"));
	}while (x <= 0 && base <= 1);
	{
	if(x>0 && base>1) {
		for (int n = 0; x>base; n++)
		{
			x = x/base;
			int counter = n;
		System.out.println("Logarithm of the base and value is: "+counter);
			}
				
				
			
	while (x > 0 && base > 1);}
	{
	}
	}
	}
}
	




		
	
	
	

	


	
	

		 
		 
	


		 
		 
			
		



