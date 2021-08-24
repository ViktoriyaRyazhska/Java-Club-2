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
		if (1 <= age && age <= 100) {
			if (age <= 14) {
				min = (int) (age - age * 0.1);
				max = (int) (age + age * 0.1);
			} else {
				min = age / 2 + 7;
				max = (age - 7) * 2;
			}
			String dRange = String.valueOf(min) + "-" + String.valueOf(max);
			return dRange;
		} else {
			return "Error!!!Age must be from 1 to 100!";
		}
	}

	public static void main(String[] args) {
		
		System.out.print("\tTask 10.\n\t\tage/2+7=min (age-7)*2=max Given an integer (1 <= n <= 100) representing a\r\n" + 
				" \t\tperson's age, return their minimum and maximum age range. This equation\r\n" + 
				" \t\tdoesn't work when the age <= 14, so use this equation instead:\r\n" + 
				"  \r\n" + 
				" \t\tmin = age - 0.10 * age max = age + 0.10 * age\r\n" + 
				"  \r\n" + 
				" \t\tYou should floor all your answers so that an integer is given instead of a\r\n" + 
				" \t\tfloat (which doesn't represent age). Return your answer in the form\r\n" + 
				" \t\t[min]-[max]\n");

		System.out.print("Input Age: ");
		Scanner sc = new Scanner(System.in);
		int age = 0;
		do {
			try {
				age = Integer.parseInt(sc.nextLine());
				break;
			} catch (Exception badAge) {
				System.out.print("Input Age as integer number! Try again: ");
			}

		} while (true);
		String dataRange = datingRange(age);
		System.out.println("Dating range: " + dataRange);
		sc.close();

	}

}
