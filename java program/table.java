package practice;

import java.util.Scanner;

public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		System.out.println("enter number:");
		int b= ob.nextInt();
		for(int i=1;i<=10;i++)
		{
			int a= b*i;
			System.out.println(b+"*"+i+"="+a);
		}
		System.out.println("\n");
		
		int i=1;
		while(i<=10)
		{
			int a= b*i;
			System.out.println(b+"*"+i+"="+a);	
			i++;
		}
		System.out.println("\nhello");
		int ii=1;
		do 
		{
			int a= b*ii;
			System.out.println(b+"*"+ii+"="+a);	
			ii++;
		}while(ii<=10);
			
	}

}
