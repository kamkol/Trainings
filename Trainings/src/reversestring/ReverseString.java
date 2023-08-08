package reversestring;

import java.util.Scanner;

public class ReverseString {

	public static void main(String args[]) {
		
		String text, reverse = "";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a string to reverse: ");
		text = scanner.nextLine();
		
		int length = text.length();
		
		for (int i = length-1; i>=0; i--) {
			reverse = reverse + text.charAt(i);	
		}
		
		System.out.println("Reverse of your string: " + reverse);
		
	}


}
