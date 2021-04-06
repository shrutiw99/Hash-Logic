package practice;

import java.util.Scanner;

public class fununiqueid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj=new Scanner(System.in);
		System.out.println("enter string :");
		String s=obj.next();
		st(s);
	}

	public static void st(String s)
	{
		int id=s.hashCode();
		System.out.println(id);
	}
}
