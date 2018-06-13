package com.visam.Assignment;
import java.util.Scanner;

public class Decbits {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter a number: ");
       int decimal = scanner.nextInt();
       System.out.println(Integer.toBinaryString(decimal));
   }
}


