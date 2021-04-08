package practice;

public class functionobj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		functionobj  obj=new functionobj ();
		int c;
		c=obj.sum(20,20);
		System.out.println("sum of a and b is ="+c);
	}
	
	
	public static int sum(int a,int b)
	{
		int c=a+b;
		return c;
	}

}
