package practice;

import java.util.Scanner;
import java.util.Arrays;

public class stringtask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ob=new Scanner(System.in);
		System.out.println("enter string:");
		String st=ob.nextLine(); 
		System.out.println(st);
		int c=st.length();
		String s="this is orange juice";
		String t="hello@world";
		String name="sakshi sharma bhardwaj"; 
		System.out.println(c);
		System.out.println(st.contains("e"));
		System.out.println(s.contains("orange"));
		System.out.println(t.lastIndexOf("o"));
		System.out.println(t.lastIndexOf("h"));
		System.out.println(s.split("@",1));
		System.out.println(name.split(" ",2));
		
		String ss="aeioude ardeA910 w";
		ss=ss.toLowerCase();
		int countv=0,countc=0,counts=0,countn=0;
		for(int i=0;i<ss.length();i++)
		{
			
			if(ss.charAt(i)=='a'||ss.charAt(i)=='e'||ss.charAt(i)=='i'||ss.charAt(i)=='o'||ss.charAt(i)=='u')
			{
				countv++;
			}
			
			else if(ss.charAt(i)>='a'&& ss.charAt(i)<='z')
			{
				countc++;
			}
			else if(Character.isDigit(ss.charAt(i)) )
			{
				countn++;
			}
			else 
			{
				counts++;
			}
		}
			
		System.out.println("vowels:"+countv);
		System.out.println("constant:"+countc);
		System.out.println("digit:"+countn);
		System.out.println("white space:"+counts);
		
	 if(ss.contains("a")||ss.contains("e"))
		{
			countv++;
		}
	 System.out.println("vowels:"+countv);
	
	 StringBuffer ab=new StringBuffer("ccaacd");
	 
	 StringBuffer ac=ab.reverse(); 
	 System.out.println(ac);
	 //int tt=(ab.compareTo(ac));
	 System.out.println(ab.compareTo(ac));
	 //if(tt==0)
	 //{
		// System.out.println("string is palidrome");
	 //}
	 //else
		// System.out.println("string is not palidrome");
	
	}

	 
}
