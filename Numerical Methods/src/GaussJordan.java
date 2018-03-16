
public class GaussJordan {
	private int n; 
	double[][] arr = new double[20][20+1];
	GaussJordan(double[][] arr, int n)
	{
		this.n = n;
		for(int i = 0; i < n; i++)
			for(int j = 0; j < n+1; j++)
				this.arr[i][j] = arr[i][j];
		Calculation();
	}
	private void Calculation()
	{
		for(int i = 0; i < n; i++)
		{
			for(int j = i+1; j < n; j++)
			{
				if(Math.abs(arr[i][i]) < Math.abs(arr[j][i]))
				{
					for(int k = 0; k <= n; k++)
					{
						double temp = arr[i][k];
						arr[i][k] = arr[j][k];
						arr[j][k] = temp;
					}
				}
			}
		}
		println("\nThe matrix after Pivotisation\n");
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n+1; j++)
			{
				print(arr[i][j]);
				if(j == n-1)
					print(" | ");
				else
					print(" ");
			}
			println("");
		}
		println("");

//      Vhul Val Bangla Code :P 
//		for (int i=0;i<n-1;i++) 
//		{
//	        for (int j=i+1;j<n;j++)
//            {
//	        	double t = arr[j][i]/arr[i][i];
//	            for (int k=0 ; k<=n ; k++) 
//	            {
//	            	arr[j][k]=arr[j][k]-t*arr[i][k];  
//	            }
//             }
//	        
//		}
//        for(int i=n-1;i>=0;i--)
//        {
//            for(int j=i-1;j>=0;j--)
//            {
//                double temp=arr[j][i]/arr[i][i];
//                for(int k=n;k>=i;k--)
//                {
//                    arr[j][k]-=temp*arr[i][k];
//                }
//            }
//        }
		
		for(int i = 0; i < n; i++)
	    {
	        for(int j = 0; j < n; j++)
	        {
	            if(j != i)
	            {
	                double c = arr[j][i]/arr[i][i];
	                for(int k = 0; k <= n; k++)
	                {
	                    arr[j][k]=arr[j][k]-c*arr[i][k];
	                }
	            }
	        }
	    }
        println("The matrix after gauss-jordan elimination:\n");
        for(int p = 0; p < n; p++)
        {
        	for(int q = 0; q < n+1; q++)
        	{
        		System.out.printf("%f ", arr[p][q]);
        	}
        	println("");
        }
        println("");
        println("The solutions of those equations:");
        for(int i = 0; i < n; i++)
        {
        	System.out.printf("x%d = %f\n",i+1,arr[i][n]/arr[i][i]);
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

