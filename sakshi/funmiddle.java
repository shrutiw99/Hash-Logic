package practice;

import java.util.Scanner;

public class funmiddle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj=new Scanner(System.in);
		System.out.println("enter string :");
		String s=obj.next();
		st(s);
	}

	public static void st(String s)
	{
		int len=s.length();
		int mid=(len/2);
		
		System.out.println("length "+len);
		System.out.println("middle"+ s.charAt(mid));
	}
}
