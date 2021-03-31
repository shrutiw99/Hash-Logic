package test;

import java.util.Scanner;

public class arm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int sum=0,sqr,r;
		for(int i=0;i<=1000;i++)
		{
	
			for(int a=i;a>0;a=a/10)
		{
			r=a%10;
			sqr=r*r*r;
			sum=sum+sqr;
			
			
		}
		if(sum==i)
			System.out.println(i+" ");	
			sum=0;
		}

	}

}
