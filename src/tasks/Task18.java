package tasks;

import java.util.Scanner;

/**
 * Very simple, given a number, find its opposite.
 * 
 * @author Taras Krasitskyi
 *
 */

public class Task18 {
	public static int opposite(int number) {
		// your code here
		return -1 * number;
	}

	public static void main(String[] args) {

		System.out.print("\tTask 2.\n\t\tVery simple, given a number, find its opposite.\n");
		Scanner sc = new Scanner(System.in);
		int num = 0;
		String inputAnswer = " ";
		boolean check = true;
		do {
			System.out.print("Input integer number: ");
			do {
				try {
					num = Integer.parseInt(sc.nextLine());
					break;
				} catch (Exception badNumber) {
					System.out.print("You must input integer value. Try again: ");
				}

			} while (true);

			System.out.println("Opposite to " + num + " is: " + opposite(num));

			System.out.print("\tDo you want execute task again? (Y/N): ");
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
		// sc.close();

	}

}
