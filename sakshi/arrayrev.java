package practice;

import java.util.Scanner;

public class arrayrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		int arr[]=new int[10];
		int a[]=new int[arr.length];

		for(int i=0;i<arr.length;i++)
		{
			System.out.print("enter element"+i+":");
			arr[i]=ob.nextInt();
	    }System.out.println("after reverse");

		for(int i=0,j=arr.length-1; i<arr.length;i++,j--)
		{
		
			a[i]=arr[j];
						System.out.print(a[i]+" ");
		
		}
		
		
		
		
	}

}
