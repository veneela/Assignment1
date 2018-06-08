import java.util.Scanner;
public class Fibonacci {
 public static void main(String args[]) {
 Scanner scan = new Scanner(System.in);
 System.out.println("How many Fibonacci number do you want?");
 int n=scan.nextInt();
 int a,b,c;
 a=0;
 b=1;
 int flag=1;
 System.out.println("Fibonacci series:");
 while(flag<=n)
  {
	 String t=",";
	 if(flag==n)
		 t="";
	 System.out.println(a+t);
	 c=a+b;
	 a=b;
	 b=c;
	 flag++;
  }
 }
}

