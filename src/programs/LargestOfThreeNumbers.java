package programs;

import java.util.Scanner;

public class LargestOfThreeNumbers {
	public static void main(String[] args) {
		
System.out.println("Add Two Numbers");
		
		int firstNumber;
		int secondNumber;
		int thirdNumber;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		firstNumber = scanner.nextInt();
		
		System.out.println("Enter second number: ");
		secondNumber = scanner.nextInt();
		
		System.out.println("Enter third number: ");
		thirdNumber = scanner.nextInt();
		
		if(firstNumber > secondNumber && firstNumber > thirdNumber) {
			System.out.println("First Number is greater");
		} else if(secondNumber > firstNumber && secondNumber > thirdNumber) {
			System.out.println("Second Number is greater");
		} else if(thirdNumber > firstNumber && thirdNumber > secondNumber) {
			System.out.println("Third Number is greater");
		} else {
			System.out.println("Three numbers are not distinct.");
		}
		
		scanner.close();
	}

}
