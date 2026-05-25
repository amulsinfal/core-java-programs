package programs;

import java.util.Scanner;

public class InputUsingScanner {

	public static void main(String[] args) {
		System.out.println("Input Using Scanner");
		
		int intInput;
		float floatInput;
		String stringInput;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string: ");
		stringInput = scanner.nextLine();
		System.out.println("Entered string: " + stringInput);
		
		System.out.println("Enter integer: ");
		intInput = scanner.nextInt();
		System.out.println("Entered integer: " + intInput);
		
		System.out.println("Enter floating point number:");
		floatInput = scanner.nextFloat();
		System.out.println("Enter floating point: " + floatInput);

		scanner.close();
	}

}
