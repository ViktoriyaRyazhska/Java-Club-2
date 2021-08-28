package tasks;
/*
 * age/2+7=min (age-7)*2=max Given an integer (1 <= n <= 100) representing a
 * person's age, return their minimum and maximum age range. This equation
 * doesn't work when the age <= 14, so use this equation instead:
 * 
 * min = age - 0.10 * age max = age + 0.10 * age
 * 
 * You should floor all your answers so that an integer is given instead of a
 * float (which doesn't represent age). Return your answer in the form
 * [min]-[max]
 * 
 *  @author Taras Krasitskyi
 */

import java.util.Scanner;

public class Task10 {

	public static String datingRange(int age) {

		int min = 0;
		int max = 0;
		if (age < 1 || age > 100) {
			throw new IllegalArgumentException("Illegal Argument. Age must be 1 <= age <= 100.");
		} else {
			if (age <= 14) {
				min = (int) (age - age * 0.1);
				max = (int) (age + age * 0.1);
			} else {
				min = age / 2 + 7;
				max = (age - 7) * 2;
			}
			String dRange = String.valueOf(min) + "-" + String.valueOf(max);
			return dRange;
		}

	}

	public static void main(String[] args) {

		System.out.print("\tTask 10.\n\t\tage/2+7=min (age-7)*2=max Given an integer (1 <= n <= 100) representing a\r\n"
				+ " \t\tperson's age, return their minimum and maximum age range. This equation\r\n"
				+ " \t\tdoesn't work when the age <= 14, so use this equation instead:\r\n" + "  \r\n"
				+ " \t\tmin = age - 0.10 * age max = age + 0.10 * age\r\n" + "  \r\n"
				+ " \t\tYou should floor all your answers so that an integer is given instead of a\r\n"
				+ " \t\tfloat (which doesn't represent age). Return your answer in the form\r\n"
				+ " \t\t[min]-[max]\n");

		Scanner sc = new Scanner(System.in);
		String inputAnswer = " ";
		boolean check = true;
		int age = 0;
		do {
			System.out.print("Input Age: ");
			do {
				try {
					age = Integer.parseInt(sc.nextLine());
					break;
				} catch (Exception badAge) {
					System.out.print("Input Age as integer number! Try again: ");
				}

			} while (true);
			try {
				String dataRange = datingRange(age);
				System.out.println("Dating range: " + dataRange);
			} catch (IllegalArgumentException e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
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
