package com.visam.Assignment2;
import java.util.Scanner;
public class Palindrome {
	public static void main(String args[])
	{
		String original,reverse="";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string to check whether it is a palindrome or not");
		original= scan.nextLine();
		int length = original.length();
		for ( int i = length - 1; i >= 0; i-- )
	         reverse = reverse + original.charAt(i);
	      if (original.equals(reverse))
	         System.out.println("Entered string is a palindrome.\n" +original);
	      else
	         System.out.println("Entered string isn't a palindrome.\n" + original);
	}
	
}
