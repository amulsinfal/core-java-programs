package programs;

import java.util.Scanner;

public class SwapTwoNumbersWithoutThirdVariable {
	public static void main(String[] args) {
		
		System.out.println("Swap Two Numbers Without Third Variable");
		
		int firstNumber;
		int secondNumber;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		firstNumber = scanner.nextInt();
		
		System.out.println("Enter second number: ");
		secondNumber = scanner.nextInt();
		
		System.out.println("Before Swapping: ");
		System.out.println(firstNumber + " , " + secondNumber);
		
		firstNumber = firstNumber + secondNumber;
		secondNumber = firstNumber - secondNumber;
		firstNumber = firstNumber - secondNumber;
		
		System.out.println("After Swapping: ");
		System.out.println(firstNumber + " , " + secondNumber);
		
		scanner.close();		
		
	}
}
