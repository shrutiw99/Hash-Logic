import java.util.Scanner;

public class user {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
System.out.print("Enter a string: ");  
String str= s.nextLine();             
System.out.print("You have entered: "+str);        
s.close();

// 2nd program by find length of string
System.out.println();

String a = "refrigerator";
System.out.println(a.length());

// 3rd program if letter is there 

System.out.println();
String d = "Umbrella";
boolean p = false;
for(int i = 0;i<d.length();i++)
{
  if(d.charAt(i) == 'e')
  {
    p=true;
    break;
  }
}
System.out.println(p);
}
}
			