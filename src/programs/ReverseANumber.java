package programs;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		System.out.println("Program to reverse a number");
		int num, rev = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		num = scanner.nextInt();

		while (num != 0) {
			rev = rev * 10;
			rev = rev + num % 10;
			num = num / 10;
		}
		System.out.println("Reverse of entered number is " + rev);

		scanner.close();
	}

}
