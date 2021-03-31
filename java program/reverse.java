package test;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ob=new Scanner(System.in);
		
		System.out.println("enter string:");
		String st=ob.next();
		StringBuffer ab=new StringBuffer(st);
		 
		 StringBuffer ac=ab.reverse(); 
		 System.out.println(ac);
		
		
		
	}

}
