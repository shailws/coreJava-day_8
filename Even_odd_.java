package Day08;

import java.util.Scanner;

public class Even_odd_ {
	public static void even_odd(int n) {
		if(n%2==0) {
			System.out.println( n + " is even number");
		}
		else {
			System.out.println( n + " is odd number");
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		
		even_odd(num);
	}
}
