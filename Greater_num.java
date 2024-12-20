package Day08;

import java.util.Scanner;

public class Greater_num {
	public static void greater(double a, double b) {
	  if(a>b) {
		  System.out.println( a + " is greater number");
	  }
	  else {
		  System.out.println( b + " is greater number");
	  }
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter fist number : ");
		double n1 = sc.nextDouble();
		System.out.println("Enter second number : ");
		double n2 = sc.nextDouble();
		
		greater(n1,n2);
	}
}
