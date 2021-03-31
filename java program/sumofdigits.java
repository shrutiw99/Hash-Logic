package practice;

import java.util.Scanner;

public class sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ob=new Scanner(System.in);
		System.out.println("enter digit:");
		int num=ob.nextInt();
		int sum=0;
		int i=1;
		do
		{
			sum=sum+i;
			i++;
			System.out.println(sum);
		}while(i<=num);
		System.out.println(sum);
		
	}

}
