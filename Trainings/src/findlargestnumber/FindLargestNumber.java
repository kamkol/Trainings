package findlargestnumber;

import java.util.Iterator;
import java.util.Scanner;

public class FindLargestNumber {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter the number: ");
		int x = scanner.nextInt();
		
		int[] numbers = new int[x];
		
		for (int i = 0; i < x; i++) {
			numbers[i] = scanner.nextInt();
		}
		
		int largestNumber = findLargestNumber(numbers);
		
		System.out.println();
		
	}

}
