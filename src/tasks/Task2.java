package tasks;

import java.util.Scanner;

/**
 * 
 * Implement a function which multiplies two numbers.
 * 
 * @author Taras Krasitskyi
 * 
 *
 */

public class Task2 {

	public static int multiply(int num1, int num2) {
		return num1 * num2; // your code goes here
	}

	public static void main(String[] args) {
		
		System.out.print("\tTask 2.\n\t\tImplement a function which multiplies two numbers.\n");
		
		int num1 = 0;
		int num2 = 0;

		System.out.print("Input number1:");
		Scanner sc = new Scanner(System.in);

		do {
			try {
				num1 = Integer.parseInt(sc.nextLine());
				break;
			} catch (Exception e) {
				System.out.println("Entered non-integer value!!!");
				System.out.print("Input valid integer value:");

			}
		} while (true);

		System.out.print("Input number2:");

		do {
			try {
				num2 = Integer.parseInt(sc.nextLine());
				break;
			} catch (Exception e) {
				System.out.println("Entered non-integer value!!!");
				System.out.print("Input valid integer value:");
			}
		} while (true);

		System.out.println("Result " + num1 + " * " + num2 + " =  " + Task2.multiply(num1, num2));

		sc.close();

	}

}
