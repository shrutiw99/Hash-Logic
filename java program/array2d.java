
package practice;

import java.util.Scanner;

public class array2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int r,c;
          Scanner ob=new Scanner(System.in);
          
          System.out.print("enter row number:");
          r=ob.nextInt();
      
         System.out.print("enter col number:");
          c=ob.nextInt();

		int arr[][]=new int[r][c];
       int a[][]=new int[r][c];
       int ar[][]=new int[r][c];
       
       System.out.println("For first array");       
        for(int i=0;i<r;i++)
        {
        	for(int j=0;j<r;j++)
            {
        		System.out.print("enter element["+i+"] ["+j+"]:");
        		arr[i][j]=ob.nextInt();
        		
            }
      
      }
        
        
        System.out.println("For first array trasnpose:");       
        for(int i=0;i<r;i++)
        {
        	for(int j=0;j<r;j++)
            {
        		System.out.print(arr[j][i]);
        		
            }
        }
        System.out.println("\nFor second array");
        for(int i=0;i<r;i++)
        {
        	for(int j=0;j<r;j++)
            {
        		System.out.print("enter element["+i+"] ["+j+"]:");
        		a[i][j]=ob.nextInt();
        		
            }
        }
        System.out.println("First array");
        for(int i=0;i<r;i++)
        {
        	for(int j=0;j<r;j++)
            {
        		System.out.print(arr[i][j]+" ");
            }System.out.println();
        }
        System.out.println("\nSecond array");
        for(int i=0;i<r;i++)
        {
        	for(int j=0;j<r;j++)
            {
        		System.out.print(a[i][j]+" ");
            }System.out.println();
        }
       
        
        int count=0;
        for(int t=0;t<r;t++)
        {
        	for(int s=0;s<r;s++)
            {
        	if(arr[t][s]==a[t][s])
        	{
        		count=1;
        	}
            }
        }
        if(count==1)
        {
        	System.out.println("\nmatrix are same");
        }
        else
        {
        	System.out.println("\nmatrix are not same");
        }
        for(int i=0;i<r;i++)
        {
        	for(int j=0;j<r;j++)
            {
        	ar[i][j]=arr[i][j]+a[i][j];	
            }
        
        }
        System.out.println("\nAfter addition:");
        for(int i=0;i<r;i++)
        {
        	for(int j=0;j<r;j++)
            {
        		System.out.print(ar[i][j]+" ");
            }System.out.println();
        }
        
        System.out.println("\nAfter multiplication:");
        for(int i=0;i<r;i++)
        {
        	for(int j=0;j<r;j++)
            {
        		ar[i][j]=0;
        		for(int k=0;k<r;k++)
        		{
        			ar[i][j]+=arr[i][k]*a[k][j];	
        		}
        		System.out.print(ar[i][j]+" ");
            }System.out.println();
        }
	}

}
