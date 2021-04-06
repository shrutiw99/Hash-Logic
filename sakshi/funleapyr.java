package practice;

public class funleapyr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fun obj=new fun();
		obj.leapyr(2000);//1900,2100 is not leap yr but they are divisible 4 but not by 400
	}
}

   class fun
     {
	public static void leapyr(int yr)
	{
		if(yr%4==0 && yr%400==0)
		{
			System.out.println("its a leap year");
		}
		else
	
			System.out.println("its not a leap year");
	}
	
}
