package function;

public class Palindrome 
{
public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	    int t,s;
	    int n= 12121;
	    int r,sum=0,temp;    
		   temp=n; 
	   
	    if(sum==temp)
		System.out.println(temp+" is a palindrome number ");
                   else
		System.out.println(temp+" is not a palindrome number ");                  
	}
	static int  palindrome(int num )
	{
	    int sum=0,r;
	    while(num!=0)
	    {
	    r=num%10;
	    sum=(sum*10)+r;
	    num/=10;	
	    }
	return sum;
		
	}


}
