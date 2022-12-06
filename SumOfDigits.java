package jaw371_lab10;

public class SumOfDigits {
	public static int sumOfDigits(int x) {
		if(x<0) {
			return sumOfDigits(-x);
		} else if(x<10) {
			return x;
		} else {
			return (x%10) + sumOfDigits(x/10);
		}
	}

	public static void main(String [] args) {
		System.out.println(sumOfDigits(234));
		System.out.println(sumOfDigits(12));
		System.out.println(sumOfDigits(39));
		System.out.println(sumOfDigits(-12));
		System.out.println(sumOfDigits(0));
	}
}






	
 
 

  
