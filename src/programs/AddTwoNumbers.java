package programs;

import java.util.Scanner;

public class AddTwoNumbers {
	
	public static void main(String[] args) {
		
		System.out.println("Add Two Numbers");
		
		int firstNumber;
		int secondNumber;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		firstNumber = scanner.nextInt();
		
		System.out.println("Enter second number: ");
		secondNumber = scanner.nextInt();
		
		int result = firstNumber + secondNumber;
		
		System.out.println("Addition of two number: " + result);
		
		scanner.close();
		
	}

}
