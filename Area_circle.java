package Day08;

import java.util.Scanner;

public class Area_circle {
public static double area_circle(double rad){
		
		double area = 3.14*rad*rad;
		
		return area;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of circle: ");
		double area1 = sc.nextDouble();
		
		double result = area_circle(area1);
		
		System.out.println("Area of circle : " + result);
	}

}
