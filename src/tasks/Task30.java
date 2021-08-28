package tasks;

import java.util.Scanner;

/**
 * You're writing code to control your town's traffic lights. You need a
 * function to handle each change from green, to yellow, to red, and then to
 * green again.
 * 
 * Complete the function that takes a string as an argument representing the
 * current state of the light and returns a string representing the state the
 * light should change to.
 * 
 * For example, update_light('green') should return 'yellow'.
 * 
 * @author taras Krasitskyi
 *
 */

public class Task30 {

	public static String updateLight(String current) {

		if (!current.equals("green") && !current.equals("yellow") && !current.equals("red")) {
			throw new IllegalArgumentException("Error. IllegalArgument.");
		} else {
			return (current.equals("green") ? "yellow" : current.equals("yellow") ? "red" : "green");
		}
	}

	public static void main(String[] args) {
		System.out.println("\tTask30.\n\t\t* You're writing code to control your town's traffic lights. You need a\r\n"
				+ " \t\t* function to handle each change from green, to yellow, to red, and then to\r\n"
				+ " \t\t* green again.\r\n" + " \t\t* \r\n"
				+ " \t\t* Complete the function that takes a string as an argument representing the\r\n"
				+ " \t\t* current state of the light and returns a string representing the state the\r\n"
				+ " \t\t* light should change to.\r\n" + " \t\t* \r\n"
				+ " \t\t* For example, update_light('green') should return 'yellow'.");

		Scanner sc = new Scanner(System.in);
		String result = "";
		String inputString = "";
		boolean check = true;
		String clr = "";
		do {
			System.out.print("\tInput color: ");
			do {
				try {
					clr = sc.nextLine();
					result = Task30.updateLight(clr);
					System.out.println("Next color is: " + result);
					break;
				} catch (IllegalArgumentException badColor) {
					System.out.print("\t" + badColor.getMessage() + " Input rigth color (green/yellow/red): ");
				}
			} while (true);

			System.out.print("\tDo you want execute task again? (Y/N): ");
			do {
				try {
					inputString = sc.nextLine();
					if (inputString.equals("Y") || inputString.equals("N")) {
						check = true;
					} else {
						throw new IllegalArgumentException("Error. Bad answer!  ");
					}

					break;
				} catch (Exception badAnswer) {
					System.out.print("\t" + badAnswer.getMessage() + "Input \'Y\' or \'N\': ");
				}

			} while (true);

			if (inputString.equals("N")) {
				check = false;
				System.out.println("\tTask terminated!");
			}

		} while (check);

	}

}
