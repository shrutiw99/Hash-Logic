package practice;

import java.util.Scanner;

public class sumofdigit2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		System.out.println("enter digit:");
		int num=ob.nextInt();
		int sum=0;
		int i=1;
		do
		{
			int r=num%10;
			sum=sum+r;
			num=num/10;
		}while(num>0);
	System.out.println(sum);
	}
	

}
