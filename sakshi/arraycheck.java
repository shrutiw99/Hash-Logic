package practice;

import java.util.Scanner;

public class arraycheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
        int a[]=new int[5];
        boolean r=true;
        System.out.println("enter elements:");
        for(int i=0;i<a.length;i++)
        {
        a[i]=ob.nextInt();
        }
        int j=a.length-1;
        for(int i=0;i<=a.length/2;i++)
        {
        	if(a[i]!=a[j])
        	{
        		r=false;
        		break;
        	}
        	else
        		j--;
        }
        System.out.println(r);
	}

}
