import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.lang.*;

public class banking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ob=new Scanner(System.in);

		functionality obj=new functionality();
		System.out.println("  \n      welome to our Banking application     ");
		System.out.println("  -----------------------------------------");
		
		System.out.println("ENTER YOUR ACCOUNT NUMBER:");
		int acc=ob.nextInt();
		System.out.println("\n        * Hello "+acc+ " welcome to our application*");
		obj.fun();
	}
}

class functionality
{
		Scanner obj=new Scanner(System.in);
		
		public void fun()
		{
		
		int ch;
		
			
		do
		{
		System.out.println("\n\n *choose any functionality given below:*");
		System.out.println("    -------------------------------");
		System.out.println("\n1.Check your balance");
		System.out.println("2.Make a deposit");
		System.out.println("3.Make a withdrawal ");
		System.out.println("4.View the previous transaction");
		System.out.println("5.Calculate Interest");
		System.out.println("6.Exit the application");
		
		 ch=obj.nextInt();
		//System.out.println(ch);
		switch(ch)
		{
		case 1:
		{
			//System.out.println("\n1.Check your balance");
			bal();
			break;
			
		}
		
		case 2:
		{
			//System.out.println("2.Make a deposit");
			dep();
			break;
		}
		
		case 3:
		{
			//System.out.println("3.Make a withdrawal ");
			wid();
			break;
		}
		
		case 4:
		{
			//System.out.println("4.View the previous transaction");
			tran();
			break;
		}
		
		case 5:
		{
			//System.out.println("5.Calculate Interest");
			inter();
			break;
		}
		
		case 6:
		{	
			System.exit(1);
			
		}
		
		default:
		{
			System.out.println("please check your input correctly");
			break;
		}
	}
		}while(ch<6);
		
		}
	static double bal=100.0;
	double ab,ac;
	
	public void bal()
	{
		
		System.out.println("Balance in your account are: "+bal);
		System.out.println(" ");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	     try {
			String input=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
		
	}
	
	public void dep()
	{
		double temp=bal;
		System.out.println("Enter a money you want to deposit here:");
		double depp=obj.nextDouble();
		bal=temp+depp;
		ab=depp;
		System.out.println("Balance in your account are: "+bal);
		
		
		System.out.println(" ");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	     try {
			String input=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void wid()
	{
		System.out.println("Enter a money you want to withdrawal here:");
		double w=obj.nextDouble();
		bal=bal-w;
		ac=w;
		System.out.println("Balance in your account are: "+bal);
		
		System.out.println(" ");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	     try {
			String input=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void tran() 
	{
		System.out.println("Your last two transcations are:");
		System.out.println("deposit money.....   +"+ab);
		System.out.println("withdrawal money.....   -"+ac);
		
		System.out.println(" ");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	     try {
			String input=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void inter()
	{
		double si=0;
		int r=15,t=1;
		si=(bal*r*t)/100;
		System.out.println("Simple interest is: "+si);
		
		
		System.out.println(" ");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	     try {
			String input=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
}
	
	

