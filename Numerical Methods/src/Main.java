import java.util.*;

public class Main {
	static Scanner scan = new Scanner(System.in);
	
	/** 
	 * Example Equation
	 * 					 x1 - 3x2 +  x3 = 4
	 * 					2x1 - 8x2 + 8x3 = -2
	 * 				   -6x1 + 3X2 -15x3 = 9
	 * @param args
	 */
	
	public static void main(String[] args) {
		println("Enter the number of equations");
		int n = scan.nextInt();
		int key;
		double[][] arr = new double[n][n+1];
		println("Enter the "+n*(n+1)+" elements of the augmented-matrix row-wise:\n");
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n+1; j++)
			{
				arr[i][j] = scan.nextDouble();		
			}
		}
		println("\nPress 1 Gauss-Elimination method\nPress 2 Gauss-Jordan method\n");
		key = scan.nextInt();
		if(key == 1)
		{
			new GaussElimination(arr,n);
		}
		else if(key == 2)
		{
			new GaussJordan(arr,n);
		}
	}
	public static void print(Object s)
	{
		System.out.print(s);
	}
	public static void println(Object s)
	{
		System.out.println(s);
	}
}
