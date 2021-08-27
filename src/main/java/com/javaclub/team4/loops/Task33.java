/*
 * https://www.codewars.com/kata/cat-years-dog-years
 */

package com.javaclub.team4.loops;

import com.javaclub.team4.Task;
import java.io.IOException;

/*
I have a cat and a dog.

I got them at the same time as kitten/puppy. That was humanYears years ago.

Return their respective ages now as [humanYears,catYears,dogYears]

NOTES:

humanYears >= 1
humanYears are whole numbers only
Cat Years
15 cat years for first year
+9 cat years for second year
+4 cat years for each year after that
Dog Years
15 dog years for first year
+9 dog years for second year
+5 dog years for each year after that
*/

public class Task33 extends Task {

	@Override
	public void runTask() {

		System.out.println("\nThis is Task33 and it calculates cat's and dog's years in relation to human's ones.\n");

		int[] years = new int[3];

		System.out.println("Please enter human years to convert them into cat's and dog's respectively:");
		while (true) {
			try {
				years = humanYearsCatYearsDogYears(Integer.parseInt(br.readLine()));
				break;
			} catch (NumberFormatException | IOException e) {
				System.err.println("Invalid input :( Try some reasonable human years:");
			}
		}

		if (years[0] == 1) {
			System.out.println("Human's " + years[0] + " year is " + years[1] + " in cat's years, and " + years[2]
					+ " in dog's years.");
		} else {
			System.out.println("Human's " + years[0] + " years is " + years[1] + " in cat's years, and " + years[2]
					+ " in dog's years.");
		}

		System.out.println("\nExiting to Main menu.\n");
	}

	public static int[] humanYearsCatYearsDogYears(final int humanYears) {

		int catYears = 0;
		int dogYears = 0;

		if (humanYears == 1) {
			catYears = 15;
			dogYears = 15;
		} else if (humanYears == 2) {
			catYears = 24;
			dogYears = 24;
		} else {
			catYears = 24 + (humanYears - 2) * 4;
			dogYears = 24 + (humanYears - 2) * 5;
		}
		return new int[] { humanYears, catYears, dogYears };
	}
}
