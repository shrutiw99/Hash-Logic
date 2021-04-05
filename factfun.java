package practice;

import java.util.Scanner;

public class factfun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fac(5);
		fab(5);
		int arr[]=new int[3];
		sak(arr);
	}
	
	public static void fac(int num)
	
	{
		int fac=1;
		for(int i=num;i>=1;i--)
		{	
			 fac=fac*i;	
		}
		System.out.println(fac);
	}

	public static void fab(int num)
	{
		int a=0,b=1;
		int c=0;
		System.out.println(a);System.out.println(b);
		for(int i=2;i<=num;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
	
	
	public static void sak(int num[])
	{
		Scanner ob=new Scanner(System.in);
		for(int i=0;i<num.length;i++)
		{
			System.out.print("enter element"+i+":");
			num[i]=ob.nextInt();
			
		}
		int sum=0;
		float av=0;
		for(int i=0;i<num.length;i++)
		{
			System.out.println("Elements are:"+num[i]);
			sum=sum+num[i];
			av=sum/2;
			
		}
		System.out.println("sum of elements:"+sum);
		System.out.println("avg of elements:"+av);

		
	}
	
}
