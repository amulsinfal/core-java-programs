package programs;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		System.out.println("Program to find the factorial of a number");
		int num, fact = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		num = scanner.nextInt();
		
		if(num < 0) {
			System.out.println("Number should be greater then 0.");
		} else {
			for(int i = 1; i <= num ; i++) {
				fact = fact * i;
			}
			System.out.println("Factorial of number " + num + " is " + fact);
		}
		
		scanner.close();
	}
}
