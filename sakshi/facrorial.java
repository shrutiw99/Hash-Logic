package practice;

import java.util.Scanner;

public class facrorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		System.out.println("enter number:");
		int b= ob.nextInt();
		int fac=1;
	for(int i=b;i>=1;i--)
	{
		
		fac=fac*i;
		
	}
	System.out.println(fac);
	
	
	int j=1;
	while(j>=1)
	{
		fac=fac*j;
		j--;
		
	}
	System.out.println(fac);
	
	
	int k=1;
	do
	{
		fac=fac*k;
		k--;
		
	}
	while(k>=1);
	System.out.println(fac);
	
	
	}

}
