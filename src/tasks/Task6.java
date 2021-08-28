package tasks;

import java.util.Scanner;

/**
 * 
 * Given a non-negative integer n, write a function to_binary/ToBinary which
 * returns that number in a binary format.
 * 
 * @author Taras Krasitskyi
 *
 */

public class Task6 {

	public static int toBinary(int n) {
		int binaryInt = 0;
		try {
			if (n < 0) {
				throw new IllegalArgumentException("Error. Illegal Argument. Number must be > 0.");
			}
		} catch (IllegalArgumentException illegalArgument) {
			// TODO: handle exception
		}

		String intToBinary = Integer.toBinaryString(n);

		// if integer out of range throw exception
		try {
			binaryInt = Integer.parseInt(intToBinary);
		} catch (Exception e) {
			System.out.println("Error. " + e.getMessage() + " Can't convert String to int!");
		}
		return binaryInt;

	}

	public static void main(String[] args) {
		System.out.print("\tTask 6.\n\t\t Given a non-negative integer n, write a function to_binary/ToBinary"
				+ " which\t\n returns that number in a binary format.\n\n");
		Scanner sc = new Scanner(System.in);
		String inputAnswer = " ";
		boolean check = true;
		do {
			System.out.print("Input Integer number: ");
			do {

				try {
					// num = Integer.parseInt(sc.nextLine());
					System.out.println("Number in binary: " + toBinary(Integer.parseInt(sc.nextLine())));
					break;
				} catch (Exception badNumber) {
					System.out.print("Bad number. Number must be non-integer! Try again: ");
				}
			} while (true);

			System.out.print("\tDo you want execute task again? (Y/N): ");

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

		// sc.close();

	}

}
