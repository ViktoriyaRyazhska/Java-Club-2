package tasks;

import java.util.Scanner;

/**
 * You receive an array with your peers' test scores. Now calculate the average
 * and compare your score! Return True if you're better, else False! Note: Your
 * points are not included in the array of your class's points. For calculating
 * the average point you may add your point to the given array!
 * 
 * @author Taras Krasitskyi
 */

public class Task38 {
	public static boolean betterThanAverage(int[] classPoints, int yourPoints) {

		if (classPoints.length == 0) {
			throw new IllegalArgumentException("Illegal Argument.  Array size is 0.");

		} else {
			for (int point : classPoints) {
				if (point < 0) {
					throw new IllegalArgumentException("Illegal Argument.  Points is < 0.");
				}
			}
		}
		if (yourPoints < 0) {
			throw new IllegalArgumentException("Illegal Argument.  Your Points is < 0.");

		} else {

			// Your code here
			int sizeArray = (classPoints.length) + 1;
			int[] allPoints = new int[sizeArray];
			for (int i = 0; i < classPoints.length; i++) {
				allPoints[i] = classPoints[i];
			}
			allPoints[sizeArray - 1] = yourPoints;
			int averageMark = 0;
			for (int i = 0; i < allPoints.length; i++) {
				averageMark += allPoints[i];
			}
			averageMark = (int) Math.round(averageMark / allPoints.length);

			if (yourPoints >= averageMark) {
				return true;
			} else {
				return false;
			}
		}

	}

	public static void main(String[] args) {

		System.out.println(
				"\tTask38.\n*\t\t * You receive an array with your peers' test scores. Now calculate the average\r\n"
						+ " *\t\tand compare your score!\r\n" + " *\t\tReturn True if you're better, else False!\r\n"
						+ " *\t\tNote: Your points are not included in the array of your class's points. For\r\n"
						+ " *\t\tcalculating the average point you may add your point to the given array!");
		String inputAnswer = "";
		boolean check = true;
		int[] markArray;
		int yPoints = 0;
		Scanner sc = new Scanner(System.in);
		int sizeArray = 0;
		do {
			System.out.print("Input array size with points: ");
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

			markArray = new int[sizeArray];
			for (int i = 0; i < sizeArray; i++) {
				System.out.print("\tInput mark[" + (i + 1) + "]:");
				do {
					try {
						markArray[i] = Integer.parseInt(sc.nextLine());
						break;

					} catch (IllegalArgumentException badSize) {
						System.out.print(
								"\t" + badSize.getMessage() + " Mark value must be non-negative integer. Try again: ");
						// TODO: handle exception
					}
				} while (true);
			}

			System.out.print("\tInput your points: ");
			do {
				try {
					yPoints = Integer.parseInt(sc.nextLine());
					break;

				} catch (IllegalArgumentException badSize) {
					System.out.print(
							"\t" + badSize.getMessage() + " Array size must be non-negative integer. Try again: ");
					// TODO: handle exception
				}
			} while (true);
			try {
				System.out.println("Result: " + betterThanAverage(markArray, yPoints));

			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}

			System.out.print("\tDo you want execute again? (Y/N): ");
			do {
				try {
					inputAnswer = sc.nextLine();
					if (inputAnswer.equals("Y") || inputAnswer.equals("N")) {
						check = true;
					} else {
						throw new IllegalArgumentException("Error. Bad answer!  ");
					}

					break;
				} catch (IllegalArgumentException badAnswer) {
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
