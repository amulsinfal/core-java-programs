package programs;

import java.util.Scanner;

public class FahrenheitToCelsius {
	
	public static void main(String[] args) {
		float temp;
		float result;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenheit");
		temp = scanner.nextFloat();
		result = ((temp -32) * 5)/9;
		System.out.println("Temperature in Celsis: " + result);
		scanner.close();
	}

}
