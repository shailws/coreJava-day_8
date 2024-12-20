package Day08;

import java.util.Scanner;

public class Average_marks {
    public static double average_Marks(double a, double b, double c) {
    	double avrg_marks = a+b+c/3;
		return avrg_marks;
    }
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first student marks : ");
		double m1 = sc.nextDouble();
		System.out.println("Enter second student marks : ");
		double m2 = sc.nextDouble();
		System.out.println("Enter third student marks : ");
		double m3 = sc.nextDouble();
		
		double result = average_Marks(m1, m2, m3);
		
		System.out.println("Average of marks : " + result);
	}
}
