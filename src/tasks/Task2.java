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
		String inputAnswer = "";
		boolean check = true;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Input number1:");

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

			System.out.print("\tDo you want execute test again? (Y/N): ");

			// sc.close();
			do {
				try {
					inputAnswer = sc.nextLine();
					if (inputAnswer.equals("Y") || inputAnswer.equals("N")) {
						check = true;
					} else {
						throw new RuntimeException("Error. Bad answer!  ");
					}

					break;
				} catch (Exception badAnswer) {
					System.out.print("\t" + badAnswer.getMessage() + "Input \'Y\' or \'N\': ");
				}

			} while (true);

			if (inputAnswer.equals("N")) {
				check = false;
				System.out.println("\tTask terminated!");
			}

		} while (check);

	}
}
