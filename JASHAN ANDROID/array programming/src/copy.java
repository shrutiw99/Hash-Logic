import java. util.Arrays;
public class copy 
{
	public static void main(String[] args) 
	{
		int a[]={10,20,30,40};
		int newarray[]= new int [4];
		System.out.println("Source Array : "+Arrays.toString(a));     
		   
		   for(int i=0; i < a.length; i++) {
		    newarray[i] = a[i];
		}
		   System.out.println("New Array: "+Arrays.toString(newarray));
		 }
		 }
	
