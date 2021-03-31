package practice;

import java.util.Scanner;

public class ascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		System.out.println("enter character:");
		char a= ob.next().charAt(0); 
		
		int num= (int)a;
		System.out.println(num);
		
		
		System.out.println("enter ASCII number:");
		int b= ob.nextInt();
		char c= (char)b;
		System.out.println(c);
		
		for(int i=1;i<=255;i++)
		{
			char d= (char)i;
			System.out.println("\n");
			System.out.println(d);
		}
		
	}

}
