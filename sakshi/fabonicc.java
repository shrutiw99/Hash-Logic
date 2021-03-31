package practice;

import java.util.Scanner;

public class fabonicc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0;
		int b=1;
		int c;
	    System.out.println(a);
		System.out.println(b); 
		for(int i=2;i<=5;i++) 
		{
			c= a+b;
			System.out.println(c);
			 
			 a=b;
			 b=c;
			
		}
		
		System.out.println("\n");
		int x=0;
		int y=1;
		int z;
	    System.out.println(x);
		System.out.println(y); 
		int ii=2;
		while(ii<=5)
		{
			z= x+y;
			System.out.println(z);
			 
			 x=y;
			 y=z;
			 ii++;
		}
		
		System.out.println("\n");
		int i=0;
		int j=1;
		int k;
	    System.out.println(i);
		System.out.println(j); 
		int iii=2;
		do
		{
			k=i+j;
			System.out.println(k);
			i=j;
			j=k;
			iii++;
		}while(iii<=5);
		
	}

}
