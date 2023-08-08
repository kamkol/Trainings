package reversestring;

import java.util.Scanner;

public class ReverseString {

	public static void main(String args[]) {
		
		//using for and reverse;
		System.out.println("Using for loop and reverse/original text");
		String text, reverse = "";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a string to reverse: ");
		text = scanner.nextLine();
		
		int length = text.length();
		
		for (int i = length-1; i>=0; i--) {
			reverse = reverse + text.charAt(i);	
		}
		
		System.out.println("Reverse of your string: " + reverse);
		
		
//		using internal method:
		System.out.println();
		System.out.println("Using internal method");
		StringBuffer stringBuffer = new StringBuffer("Reverse this one");
		System.out.println(stringBuffer.reverse());
		
		
	}


}
