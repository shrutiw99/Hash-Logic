package practice;

public class funsawp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 swap(10,20);
		 
		
	}
 public static void swap(int a,int b)
 {
	 int x=a,y=b;
	 x=x+y;
	 y=x-y;
	 x=x-y;
	 System.out.println("a= "+a+"b= "+b);
	 System.out.println("a= "+x+"b= "+y);
	
 }
}
