package Day08;

import java.util.Scanner;

public class Square_cube {
	public static void Sq(int n) {
		System.out.println("Square of number : " + n*n);
		System.out.println("Cube of number : " + n*n*n);
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		Sq(num);
	}
}
