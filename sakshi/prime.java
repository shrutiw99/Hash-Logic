package practice;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		System.out.println("enter number:");
		int b= ob.nextInt();
		int f=0;
	
		if(b==0||b==1)
		{	
			System.out.println("not prime number");
		f=1;
		}
		
		else
		{
		
			for(int i=2;i<=b-1;i++)
		 {
			if(b%i==0)
			{
				System.out.println("not prime number");
			f=1;
				break;
			}
		 }
		
		}
			
		if(f==0)
			{
				System.out.println(" prime number");
		    }
	}

}
