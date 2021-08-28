package tasks;

import java.util.Scanner;

/**
 * 
 * Return the average of the given array rounded down to its nearest integer.
 * 
 * @author Taras Krasitskyi
 *
 */

public class Task34 {

	public static int getAverage(int[] marks) {
		int sumMarks = 0;
		if (marks.length == 0) {
			throw new IllegalArgumentException("Error! Illegal array. Array whith marks is empty!");
		}
		for (int mark : marks) {
			if (mark < 0) {
				throw new IllegalArgumentException("Error! Illegal values in array. Marks must be non-negative!");
			} else {
				sumMarks += mark;
			}
		}
		return (int) (sumMarks / marks.length);
	}

	public static void main(String[] args) {
		System.out
				.println("\tTask34.\n*\t\tReturn the average of the given array rounded down to its nearest integer.");
		boolean check = true;
		int sizeArray = 0;
		String inputString = "";

		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("\tInput array size:");
			do {
				try {
					sizeArray = Integer.parseInt(sc.nextLine());
					if (sizeArray < 0) {
						throw new IllegalArgumentException("Error! Illegal array size.");
					}
					break;

				} catch (IllegalArgumentException badSize) {
					System.out.print(
							"\t" + badSize.getMessage() + " Array size must be non-negative integer. Try again: ");
					// TODO: handle exception
				}
			} while (true);
			int[] markArray = new int[sizeArray];
			for (int i = 0; i < sizeArray; i++) {
				System.out.print("\tInput mark[" + (i + 1) + "]:");
				do {
					try {
						markArray[i] = Integer.parseInt(sc.nextLine());
						/*
						 * if (markArray[i] < 0) { throw new
						 * IllegalArgumentException("Error! Illegal mark value."); }
						 */
						break;

					} catch (IllegalArgumentException badSize) {
						System.out.print(
								"\t" + badSize.getMessage() + " Mark value must be non-negative integer. Try again: ");
						// TODO: handle exception
					}
				} while (true);
			}
			try {
				System.out.println("Average of the marks is: " + Task34.getAverage(markArray));

			} catch (IllegalArgumentException e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}

			System.out.print("\tDo you want execute again? (Y/N): ");
			do {
				try {
					inputString = sc.nextLine();
					if (inputString.equals("Y") || inputString.equals("N")) {
						check = true;
					} else {
						throw new IllegalArgumentException("Error. Bad answer!  ");
					}

					break;
				} catch (IllegalArgumentException badAnswer) {
					System.out.print("\t" + badAnswer.getMessage() + "Input \'Y\' or \'N\': ");
				}

			} while (true);

			if (inputString.equals("N")) {
				check = false;
				System.out.print("\tApplication terminated!");
			}
			

		} while (check);
		//sc.close();

	}

}
