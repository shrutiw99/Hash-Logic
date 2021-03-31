package practice;

public class oper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;  
		System.out.println(x++);//10 (11)  
		System.out.println(++x);//12  
		System.out.println(x--);//12 (11)  
		System.out.println(--x);//10  
		int a=10,b=10,c=-10;
		boolean ab=true;
		System.out.println(a++ + ++a);
		System.out.println(b++ + b++);
		System.out.println(~a);
		System.out.println(~c);
		System.out.println(!ab);
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println(10*10/5-6+3-8*8+2);
		int v=15,h=20,j=30;
		System.out.println(v<h && v++<j);
		System.out.println(v);
		System.out.println(v<h & v++<j);
		System.out.println(v);
		System.out.println(v<h || v++<j);
		System.out.println(v);
		System.out.println(v<h | v++<j);
		System.out.println(v);
		
		

	}

}
