package Day08;

import java.util.Scanner;

public class CheckP_n {
	public static void check_num(int n) {
		
		if(n>=0) {
			System.out.println("number is positive");
		}
		else {
			System.out.println("number is negative");
		}
	}
	public static void main() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		check_num(num);
	}
}
