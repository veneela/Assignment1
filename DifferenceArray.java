package com.visam.Assignment2;
import java.util.*;
public class DifferenceArray {

	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the size of array\n");
	    int length = sc.nextInt();
	    int values[] = new int[length];
	  	System.out.println("Enter array values\n");
	  	for (int i = 0; i < values.length; i++) {
	    values[i] = sc.nextInt();
	  	}
	  	int max = values[0];
	  	int min = values[0];
	    for (int i = 1; i < values.length; i++) {
	         if (values[i] > max) 
	        	 max = values[i];
	    }
	    for (int i = 1; i < values.length; i++) {
	         if (values[i] < min) 
	        	 min = values[i];
	    }
	    int difference = max-min;
	    System.out.println(+difference);
    }
}
