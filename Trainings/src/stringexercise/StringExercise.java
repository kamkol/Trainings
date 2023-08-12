package stringexercise;

public class StringExercise {
	
	public static void main(String args[]) {
		String string1 = "hello";
		String string2 = "hemdfhlo";
		
		System.out.println(string1.compareTo(string2));
		System.out.println(string1.endsWith("lo"));
		
		System.out.println(string1.hashCode());
		System.out.println(string1.equals(string2));
		
		System.out.println(string1.toLowerCase());
	}

}
