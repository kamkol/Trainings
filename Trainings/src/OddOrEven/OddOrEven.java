package OddOrEven;

import java.util.Scanner;

public class OddOrEven {
	
	public static void main(String[] args) {
	
		int x;
		System.out.print("Enter an integer to check if it is odd or even: ");
		Scanner scanner = new Scanner(System.in);
		x = scanner.nextInt();
		
		if (x%2 == 0) {
			System.out.println("Number is even");
		} else {
			System.out.println("Number is odd");
		}
	}
}
