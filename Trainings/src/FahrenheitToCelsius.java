import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float temperature;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter temperature in Fahrenheit: ");
		temperature = scanner.nextInt();
		
		temperature = ((temperature-32)*5)/9;
		System.out.println("Temperature in Celsius: " + temperature);

	}

}
