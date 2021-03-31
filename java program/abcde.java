package practice;

import java.util.Scanner;

public class abcde {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int alphabet=65;
		for(int i=5;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
		System.out.print((char)(alphabet+j)+" ");
			
	}
	System.out.println("\n");
}
		
		Scanner ob=new Scanner(System.in);
		System.out.println("enter character:");
		String s=ob.nextLine();	
		char [] a=s.toCharArray();
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(a[j]);
			}
			System.out.println();
		}
	}

}
