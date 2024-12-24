package Day08;

import java.util.Scanner;

public class Circumference_ {
	public static double circum(double rad) {
		double cir = 2 * 3.14 * rad;
		return cir;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of circle : ");
		double rad = sc.nextDouble();
		
		double result = circum(rad);
		
		System.out.println("Circumference of circle : " + result);
	}
}
