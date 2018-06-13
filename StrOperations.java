package com.visam.Assignment;
import java.util.Scanner;
public class StrOperations {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of a");
    int a = sc.nextInt();
    System.out.println("Enter the value of b");
    String b = sc.next();
    String str = new String(b);
    System.out.println("the substring of string is:"+str.substring(a));
    System.out.println("the length is:"+str.length());
    System.out.println("the uppercase string is:"+str.toUpperCase());
    System.out.println("the intern of string is:"+str.intern());
    System.out.println("the indexof string is:"+str.indexOf(a));
    System.out.println("the string concatination is:"+str.concat("abc"));
    System.out.println("the charat of string is:"+str.charAt(a));
    System.out.println("the comparision of two strings is:"+str.compareTo("abcd"));
    System.out.println("the codepointbefore the integer a is:"+str.codePointBefore(a));
    System.out.println("the hashcode value of string is:"+str.hashCode());
    
 }
}
