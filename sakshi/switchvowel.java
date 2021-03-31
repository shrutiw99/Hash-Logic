package practice;

import java.util.Scanner;

public class switchvowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		System.out.println("enter character:");
		char chara= ob.next().charAt(0); 
		switch(chara)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("character is vowel");
			break;
			default:
				System.out.println("character is consonant");
			
		}

	}

}
