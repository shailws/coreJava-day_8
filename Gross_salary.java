package Day08;

import java.util.Scanner;

public class Gross_salary {
	public static void gross_salary(double sal) {
		double percentage;
		if(sal <= 20000) {
			percentage = 20.0;
		}
		else if(sal <= 30000) {
			percentage = 15.0;
		}
		else if(sal <= 40000) {
			percentage = 10.0;
		}
		else if(sal <= 50000) {
			percentage = 5.0;
		}
		else {
			percentage = 2.0;
		}
		
		double bonus = (percentage / 100) * sal;
		
		double gross_sal = sal + bonus;
		
		System.out.println("Salary = " + sal);
		System.out.println("Percentage = " + percentage);
		System.out.println("Bonus = " + bonus);
		System.out.println("Gross salary = " + gross_sal);
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter basic salary of employee : ");
		double salary = sc.nextDouble();
		
		gross_salary(salary);
	}
}
