package practice;

import java.util.Scanner;

public class ternaryodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		System.out.println("enter number1");
		int num = ob.nextInt();
		System.out.println("enter number1");
		int num2 = ob.nextInt();
		System.out.println("enter number1");
		int num3 = ob.nextInt();
		System.out.println((num>num2 && num>num3)?num:((num2>num3)?num2:num3));
		
	}

}
