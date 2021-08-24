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
		System.out.print("Input integer number: ");
		Scanner sc = new Scanner(System.in);
		int num = 0;
		do {
			try {
				num = Integer.parseInt(sc.nextLine());
				break;
			} catch (Exception badNumber) {
				System.out.print("You must input integer value. Try again: ");
			}

		} while (true);

		System.out.print("Opposite to " + num + " is: " + opposite(num));

		sc.close();

	}

}
