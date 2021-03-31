import java.util.Scanner;
public class summatrix
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 int m, n, c, d;
	      Scanner f = new Scanner(System.in);
	 
	      System.out.println("Input number of rows of matrix");
	      m = f.nextInt();
	      System.out.println("Input number of columns of matrix");
	      n  = f.nextInt();
	 
	      int arr1[][] = new int[m][n];
	      int arr2[][] = new int[m][n];
	      int sum[][] = new int[m][n];
	 
	      System.out.println("Input elements of first matrix");
	 
	      for (  c = 0 ; c < m ; c++ )
	         for ( d = 0 ; d < n ; d++ )
	            arr1[c][d] = f.nextInt();
	 
	      System.out.println("Input the elements of second matrix");
	 
	      for ( c = 0 ; c < m ; c++ )
	         for ( d = 0 ; d < n ; d++ )
	            arr2[c][d] = f.nextInt();
	     
	      //sum of matrices 
	      
	      for ( c = 0 ; c < m ; c++ )
	         for ( d = 0 ; d < n ; d++ )
	             sum[c][d] = arr1[c][d] + arr2[c][d]; 
	
	      System.out.println("Sum of the matrices:-");
	 
	      for ( c = 0 ; c < m ; c++ )
	      {
	         for ( d = 0 ; d < n ; d++ )
	            System.out.print(sum[c][d]+"\t");
	 
	         System.out.println();
	     f.close();
	     }
	}

}

