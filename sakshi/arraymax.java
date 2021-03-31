package practice;

import java.util.Scanner;

public class arraymax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		int arr[]=new int[3];


		for(int i=0;i<arr.length;i++)
		{
			System.out.print("enter element"+i+":");
			arr[i]=ob.nextInt();
	    }
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i]>max)
			{
			 max=arr[i];
			}
		}
		System.out.println(max);
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i]<min)
			{
			 min=arr[i];
			}
		}
		System.out.println(min);
		
		for(int j=arr.length;j<0;j++)
		{
			System.out.println(arr[j]);
		}
		
		
	}

}
