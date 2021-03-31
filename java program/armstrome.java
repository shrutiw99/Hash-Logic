package practice;

import java.util.Scanner;

public class armstrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner obj=new Scanner(System.in);
System.out.println("enter value:");
int a=obj.nextInt();
int temp,sum,sqr,r;
temp=a;
for(sum=0;a>0;a=a/10)
{
	r=a%10;
	sqr=r*r*r;
	sum=sum+sqr;
	
	
}
if(sum==temp)
	System.out.println("number is armstrome");	
else
	System.out.println("number is not armstrome");	


	}

}
