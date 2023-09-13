package randomnumber;

import java.util.Random;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Random random = new Random();
		
		for (x = 1; x<10; x++) {
			System.out.println(random.nextInt(10));
			
		}

	}

}
