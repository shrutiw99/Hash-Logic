package practice;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
int arr[]=new int[3];


for(int i=0;i<arr.length;i++)
{
	System.out.print("enter element"+i+":");
	arr[i]=ob.nextInt();
	
}
int sum=0;
float av=0;
for(int i=0;i<arr.length;i++)
{
	System.out.println("Elements are:"+arr[i]);
	sum=sum+arr[i];
	av=sum/2;
	
}
System.out.println(sum);
System.out.println(av);

for(int n:arr)
{
	System.out.println(n);
	sum=sum+n;
	av=sum/2;
}
System.out.println(sum);
System.out.println(av);
	}

}
