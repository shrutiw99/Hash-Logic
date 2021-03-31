package practice;

import java.util.Scanner;

public class arraypos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
        int a[]=new int[3];
        System.out.println("enter elements:");
        for(int i=0;i<a.length;i++)
        {
        a[i]=ob.nextInt();
        }
        
        int count=0;
        System.out.println("positive");
        for(int i=0;i<a.length;i++)
        {
        	if(a[i]>0)
        	{
        		count++;	
        	}	
        }
        System.out.println(count);
        
        
        int coun=0;
        System.out.println("negative");
        for(int i=0;i<a.length;i++)
        {
        	if(a[i]<0)
        	{
        		coun++;
        	}
        	
        }
        System.out.println(coun);
        
        int cou=0;
        System.out.println("zero's");
        for(int i=0;i<a.length;i++)
        {
        	if(a[i]==0)
        	{
        		cou++;
        	}
        	
        }
        System.out.println(cou);
       
        int co=0;
        System.out.println("even");
        for(int i=0;i<a.length;i++)
        {
        	if(a[i]%2==0)
        	{
        		co++;
        	}
        	
        }
        System.out.println(co);
        
        int c=0;
        System.out.println("odd");
        for(int i=0;i<a.length;i++)
        {
        	if(a[i]%2==1)
        	{
        		c++;
        	}
        	
        }
        System.out.println(c);
        

	}

}
