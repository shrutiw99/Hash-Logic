package practice;

public class wrappercls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		autob(10);
		unbox(3);  
		
	}
	public static void autob(int a)
	{
		Integer i=Integer.valueOf(a);  ;//converting int into Integer explicitly  
		
		Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally  
		System.out.println(i);
		System.out.println(j);
		
	}
	
	public static void unbox(int a)
	{
	Integer b=new Integer(a);
	int i=b.intValue();//converting Integer to int explicitly  
	int j=b;//unboxing, now compiler will write a.intValue() internally    
	    
	System.out.println(a+" "+i+" "+j);  
	}
}
