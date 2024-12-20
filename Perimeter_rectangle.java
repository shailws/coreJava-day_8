package Day08;

import java.util.Scanner;

public class Perimeter_rectangle {
	public static double peri_rec(double a, double b, double c, double d) {
		double peri = a+b+c+d;
		return peri;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first side of rectangle : ");
		double s1 = sc.nextDouble();
		System.out.println("Enter second side of rectangle : ");
		double s2 = sc.nextDouble();
		System.out.println("Enter third side of rectangle : ");
		double s3 = sc.nextDouble();
		System.out.println("Enter four side of rectangle : ");
		double s4 = sc.nextDouble();
		
		double result = peri_rec(s1,s2, s3,  s4);
		
		System.out.println("Perimeter of rectangle is : " + result);
		
	}
}
