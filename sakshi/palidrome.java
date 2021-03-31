package practice;

import java.util.Scanner;

public class palidrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		System.out.println("enter number:");
		int b= ob.nextInt();
		int temp=b;
		int r,sum=0;
		for(;b>0;)
		{
			r=b%10;
			sum=(sum*10)+r;
			b=b/10;
		}
			
			if(sum==temp)
			
				System.out.println("number is palidrome");
				
			else
				
				System.out.println("number is not palidrome");
			
		 
	}

}
