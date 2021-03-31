//import java.util.Scanner;
public class Palindrome
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 int n= 12121; 
		 int r,sum=0,temp;    
		   temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");

}
}