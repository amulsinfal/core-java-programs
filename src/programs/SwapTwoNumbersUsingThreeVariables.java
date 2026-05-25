package programs;

import java.util.Scanner;

public class SwapTwoNumbersUsingThreeVariables {
	public static void main(String[] args) {
		int firstNumber;
		int secondNumber;
		int temp;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		firstNumber = scanner.nextInt();
		
		System.out.println("Enter the second number: ");
		secondNumber = scanner.nextInt();
		
		System.out.println("Before Swapping: ");
		System.out.println(firstNumber + " , " + secondNumber);
		
		temp = firstNumber;
		firstNumber = secondNumber;
		secondNumber = temp;
		
		System.out.println("After Swapping: ");
		System.out.println(firstNumber + " , " + secondNumber);
		
		scanner.close();
	}

}
