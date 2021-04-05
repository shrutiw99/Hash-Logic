package practice;

import java.util.Scanner;

public class funpalidrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		pali(433);
		arm(155);
		//String ab=new String("ccaacc");
		spali("aba");
		
		Scanner obj=new Scanner(System.in);
		System.out.println("enter number");
				
		int number=obj.nextInt();
	int f=prime(number);
		if(f==0)
		{
			System.out.println("number is prime number");
		}
	}
	
	public static void pali(int num)
	{
		int temp=num;
		int r,pal=0;
		do
		{
			r=num%10;
			pal=(pal*10)+r;
			num=num/10;
		}while(num>0);
		if (pal==temp)
		{
			System.out.println("palidrome");
		}
		else
			System.out.println(" not palidrome");	
	}
	
	
	public static void arm(int num)
	{
		int temp=num;
		int r,pal=0,sqr;
		do
		{
		
	    	r=num%10;
			sqr=r*r*r;
			pal=pal+sqr;
			num=num/10;
		}while(num>0);
		if (pal==temp)
		{
			System.out.println("armstrome");
		}
		else
			System.out.println(" not armstrome");	
	}


	public static void spali(String st)
	{
		String rev=new StringBuffer(st).reverse().toString();
		if(st.equals(rev))
		{
			
			System.out.println("string is palidrome");
		}
		else
			System.out.println("string is not palidrome ");	
	}
	
	public static int prime(int a)
	{
		int f=0;
		if(a==0||a==1)
		{
			System.out.println("number is not prime number");
			f=1;
		}
		else	
		{
			for(int i=2;i<a-1;i++)
			{
				if(a%i==0)
				{
					System.out.println("number is not prime number");
					f=1;
					break;
				}
			}
		}
		
		return f;
	}

}
