package findlargestnumber;

import java.util.Scanner;

public class FindLargestNumber {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter the number of elements in the array: ");
		int x = scanner.nextInt();
		
		int[] numbers = new int[x];
        System.out.print("Enter " + x + " elements: ");
		
		for (int i = 0; i < x; i++) {
			numbers[i] = scanner.nextInt();
		}
		
		int largestNumber = findLargestNumber(numbers);
		
		System.out.println("The largest number is: " + largestNumber);
		
	}
	
	private static int findLargestNumber(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

}
