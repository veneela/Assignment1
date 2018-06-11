package com.visam.Assignment2;
import java.lang.*;
import java.util.*;
public class MathPack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a = sc.nextInt();
		System.out.println("Enter the value of b");
		float b = sc.nextFloat();
		System.out.println("Enter the value of c");
		double c = sc.nextDouble();
		System.out.println("Enter the value of d");
		long d = sc.nextLong();
		System.out.println("absolute value of a is " +Math.abs(a));
		System.out.println("absolute value of a is " +Math.addExact(a,a));
		System.out.println("absolute value of a is " +Math.decrementExact(a));
		System.out.println("absolute value of a is " +Math.nextUp(b));
		System.out.println("absolute value of a is " +Math.nextAfter(b,c));
		System.out.println("absolute value of a is " +Math.toIntExact(d));
		System.out.println("absolute value of a is " +Math.sqrt(c));
		System.out.println("absolute value of a is " +Math.log(c));
		System.out.println("absolute value of a is " +Math.ceil(c));
		System.out.println("absolute value of a is " +Math.floor(c));
	}

}
