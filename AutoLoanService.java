package com.visam.Assignment;

import java.util.Scanner;
public class AutoLoanService {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the Credit score: ");
	    int score=sc.nextInt();
		System.out.println("enter the make of car: ");
		String ma=sc.next();
		System.out.println("enter the model: ");
		String mo = sc.next();
		System.out.println("enter the loan amount: ");
		int la = sc.nextInt();
		System.out.println("enter the total amount: ");
		int ta = sc.nextInt();
		AutoLoanService als = new Premium();
		AutoLoanService als1 = new Economy();
		if(score>=750)
		{
			if(la>=30000) {
	    ((Premium) als).premiumAmount(30000,ta);
		}else {
			 ((Premium) als).premiumAmount(la,ta);
		}
		}
		else if (score>=600)
		{
			if(la>=15000) {
			    ((Economy) als1).economyAmount(15000,ta);
				}else {
		    ((Economy) als1).economyAmount(la,ta);
		}
		}
		else 
		{
			System.out.println("Loan rejected");
		}
	}
}




