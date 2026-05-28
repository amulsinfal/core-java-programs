package programs;

import java.util.Scanner;

public class OddEvenNumber {
	
	public static void main(String[] args) {
		System.out.println("Program to check the number is odd or even number");
		int num;
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Enter the number: ");
		num = scanner.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("The number is even number.");
		} else {
			System.out.println("The number is odd number.");
		}
		
		scanner.close();
	}

}
