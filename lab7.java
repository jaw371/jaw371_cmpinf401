package jaw371_Lab7;

import java.util.Random;
import java.util.Scanner;

public class Main{
	
		
	public static double max(double[]data) {
		double maxNum = data[0];
		for(int i = 1;i<data.length;i++) {
			if(maxNum < data[i]) {
				maxNum = data[i];
		}
	}
	return maxNum;
}
	public static double min(double []data) {
		double minNum = data[0];
		for(int i = 1;i<data.length;i++) {
			if(minNum < data[i]) {
				minNum = data[i];
			}
		}
		return minNum;
	}
	public static double sum(double []data) {
		int sum = 0;
		int i;
		for(i=0;i<data.length;i++) {
			sum += data[i];
		}
		return sum;
			}
	public static double ave(double []data) {
		double sum = 0;
		for(int i = 0; i<data.length;i++) {
			sum += data[i];
		}
		return sum/data.length;	
	}
	public static void main(String [] args, String maxNum, String minNum, String sum, String ave) {
		double [] data = new double[0];
		Scanner sc = new Scanner(System.in);
		System.out.println("How many items will be entered?");
		for(int i = 0; i<data.length;i++) {
			data[i] = sc.nextDouble();
			Random randFill = new Random();
		for(int a = 0; a < 5; a++) {
			data[a] = randFill.nextInt();
		}
		System.out.printf("The maximum and minimum are: "+ maxNum, minNum);
		System.out.printf("The sum and average are: "+ sum, ave);
		}
	
	}
		
		}	
	
	

