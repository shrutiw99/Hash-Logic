package practice;

import java.util.Scanner;

public class greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		System.out.println("enter number1");
		int num = ob.nextInt();
		System.out.println("enter number2");
		int num2 = ob.nextInt();
		System.out.println("enter number2");
		int num3 = ob.nextInt();
		if(num>num2  && num>num3)
		{
			System.out.println(num + " is greater number");
		}
		else if(num2>num3)
		{
			System.out.println(num2 + " is greater number");
		}
		else 
		{
			System.out.println(num3 + " is greater number");
		}
	}

}
