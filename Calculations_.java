package Day08;

import java.util.Scanner;

public class Calculations_ {
	public static void calculations(double a, double b) {
		double add = a + b;
		double sub = a - b;
		double mul = a * b;
		double div = a / b;
		double mod = a % b;
		
		System.out.println("Addition  = " + add);
		System.out.println("Subtraction  = " + sub);
		System.out.println("Multiplication = " + mul);
		System.out.println("Division  = " + div);
		System.out.println("Modulus  = " + mod);
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		double num1 = sc.nextDouble();
		System.out.println("Enter second number : ");
		double num2 = sc.nextDouble();
		
		calculations(num1, num2);
	}
}
