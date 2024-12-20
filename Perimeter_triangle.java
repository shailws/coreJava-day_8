package Day08;

import java.util.Scanner;

public class Perimeter_triangle {
	public static double perimeter(double a, double b, double c) {
		double peri = a+b+c;
		return peri;
	}
	public static void main() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first side of perimeter :");
		double n1 = sc.nextDouble();
		System.out.println("Enter second side of perimeter :");
		double n2 = sc.nextDouble();
		System.out.println("Enter third side of perimeter :");
		double n3 = sc.nextDouble();
		
		double result = perimeter(n1, n2, n3);
		
		System.out.println("Perimeter of triangle is : " + result);
	}
}
