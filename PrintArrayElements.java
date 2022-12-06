package jaw371_lab10;

public class PrintArrayElements {
	public static void printArrayElements(int[] a, int index) {
		if (index != -1) {
			printArrayElements(a,index - 1);
				System.out.println(a[index]);
		}
	}
}
