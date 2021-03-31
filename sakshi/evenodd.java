package practice;
import java.util.*;
public class evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		System.out.println("enter number");
		int num = ob.nextInt();
		if(num==0)
		{
			System.out.println("number is not even nor odd");
		}
		
		
		else if(num%2==0)
		{
			System.out.println("number is even");
		}
		else 
		{
			System.out.println("number is odd");
		}
		
	}

}
