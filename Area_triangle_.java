package Day08;

import java.util.Scanner;

public class Area_triangle_ {
	public static double triangle(double a, double b) {
		double area = (a*b)/2;
		return area;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter perpendicular height of triangle : ");
		double height = sc.nextDouble();
		System.out.println("Enter base of triagle : ");
		double base = sc.nextDouble();
		
		double result = triangle(height, base);
		
		System.out.println("Area of triangle is : " + result);
	}
}
