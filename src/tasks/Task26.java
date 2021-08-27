package tasks;

import java.util.Scanner;

/**
 * 
 * Complete the method that takes a boolean value and return a "Yes" string for
 * true, or a "No" string for false.
 * 
 * @author Taras Krasitskyi
 *
 */

public class Task26 {

	public static String boolToWord(boolean b) {
		// TODO
		if (b) {
			return "Yes";
		} else {
			return "No";
		}
	}

	public static void main(String[] args) {
		System.out.print(
				"\tTask 26.\n\t\t* Complete the method that takes a boolean value and return a \"Yes\" string for\r\n"
						+ "\t\t* true, or a \"No\" string for false..\n");
		Scanner sc = new Scanner(System.in);
		boolean vBoolean = true;
		boolean check = true;
		String inputString = "";

		do {
			System.out.print("\tInput boolean (true/false): ");
			do {
				try {
					inputString = sc.nextLine();
					if (inputString.equals("true") || inputString.equals("false")) {
						vBoolean = Boolean.parseBoolean(inputString);
					} else {
						throw new RuntimeException("Error. Bad boolean!  ");
					}

					break;
				} catch (Exception badBoolean) {
					System.out.print("\t" + badBoolean.getMessage() + "Input \'true\' or \'false\': ");
				}

			} while (true);
			System.out.println("Result: " + Task26.boolToWord(vBoolean));
			System.out.print("\tDo you want execute test again? (Y/N): ");
			do {
				try {
					inputString = sc.nextLine();
					if (inputString.equals("Y") || inputString.equals("N")) {
						check = true;
					} else {
						throw new RuntimeException("Error. Bad answer!  ");
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

		//sc.close();

	}

}
