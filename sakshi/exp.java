package test;

import java.util.Scanner;

public class exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ob=new Scanner(System.in);
        System.out.println("enter number");
        String num=ob.next();
        
       
        System.out.println(Integer.parseInt(num) +Integer.parseInt(num+num)+Integer.parseInt(num+num+num));
	}

}
