package practice;
import org.apache.commons.lang3.*;
public class tasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int arr[][]=new int[10][10];
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
			System.out.print("-"+" ");	
			}System.out.println(" ");
		}
		
		
		int flag=0,num=3;
		int ar[]= {5,8,8,7,2,3,4,1};
		int a[]= {5,6,7,2};
		String st[]= {"ab","ab","ac","ac"};
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					flag=1;
				}
				
					
			}
		}
		if(flag==1)
		{
			System.out.println("same values");
		}
		else
		System.out.println("not same values");	
		int s=0,m=0,ss=0;
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]<ar[j])
				{
				 s=j;
				 
				}
				if(ar[i]>ar[j])
				{
				 m=j;	
				}
			}
		}System.out.println(ar[s]);
		System.out.println(ar[m]);
		System.out.println(ar[ss]);
		
		
		
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.println(ar[j]);
				}
			}
		}
		
		
		
		for(int i=0;i<ar.length-1;i++)
		{
			
			for(int j=i+1;j<ar.length;j++)
			{
				if((ar[i]+ar[j]==5))
				{
					System.out.println(ar[i]+" "+ar[j]+" ="+(ar[i]+ar[j]));
				}
				
			}
			 
		}
		
	}

}
