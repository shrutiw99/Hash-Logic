import java.util.Scanner;
public class addmatix 
{
	public static void main(String[] args) 
	{
	int m, n, c, d;
    Scanner in = new Scanner(System.in);

    System.out.println("Input number of rows of matrix");
    m = in.nextInt();
    System.out.println("Input number of columns of matrix");
    n  = in.nextInt();

    int ar1[][] = new int[m][n];
    int ar2[][] = new int[m][n];
    int sum[][] = new int[m][n];

    System.out.println("Input elements of first matrix");

    for (  c = 0 ; c < m ; c++ )
       for ( d = 0 ; d < n ; d++ )
          ar1[c][d] = in.nextInt();

    System.out.println("Input the elements of second matrix");

    for ( c = 0 ; c < m ; c++ )
       for ( d = 0 ; d < n ; d++ )
          ar2[c][d] = in.nextInt();

    for ( c = 0 ; c < m ; c++ )
       for ( d = 0 ; d < n ; d++ )
           sum[c][d] = ar1[c][d] + ar2[c][d]; 

    System.out.println("Sum of the matrices:-");

    for ( c = 0 ; c < m ; c++ )
    {
       for ( d = 0 ; d < n ; d++ )
          System.out.print(sum[c][d]+"\t");

       System.out.println();
       in.close();
       
}
	}
}
