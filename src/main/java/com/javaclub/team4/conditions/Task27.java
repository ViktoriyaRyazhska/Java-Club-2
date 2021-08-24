/*
 * https://www.codewars.com/kata/will-there-be-enough-space
 */

package com.javaclub.team4.conditions;

import java.io.IOException;

import com.javaclub.team4.Task;

/*
The Story:
Bob is working as a bus driver. However, he has become extremely popular amongst the city's residents.
With so many passengers wanting to get aboard his bus, he sometimes has to face the problem of not enough space left on the bus!
He wants you to write a simple program telling him if he will be able to fit all the passengers.

Task Overview:
You have to write a function that accepts three parameters:

cap is the amount of people the bus can hold excluding the driver.
on is the number of people on the bus excluding the driver.
wait is the number of people waiting to get on to the bus excluding the driver.
If there is enough space, return 0, and if there isn't, return the number of passengers he can't take.

Usage Examples:
cap = 10, on = 5, wait = 5 --> 0 # He can fit all 5 passengers
cap = 100, on = 60, wait = 50 --> 10 # He can't fit 10 of the 50 waiting
*/

public class Task27 extends Task {

	@Override
	public void runTask() {

		int salary;
		boolean bonus = false;

		System.out.print("It's bonus time in the big city! The fatcats are rubbing their paws in anticipation…\n"
				+ "But who is going to make the most money?\n"
				+ "Please enter how many \u00A3 does fatcat get as salary:\n");

		try {
			salary = Integer.parseInt(br.readLine());

			System.out.println(new StringBuilder().append("And enter \"y\" or \"n\" if it gets a bonus or not:"));
			String bonusInput = br.readLine();

			if (bonusInput.equalsIgnoreCase("y")) {
				bonus = true;
				System.out.println(
						"Yaaay! Catso got his premial " + bonusTime(salary, bonus) + " payout with bonus!!! :3");
			} else if (bonusInput.equalsIgnoreCase("n")) {
				System.out.println("No bonus today. Only " + bonusTime(salary, bonus) + " as usual :C");
			} else {
				System.out.println("Looks like you've made a wrong entry & left catso without the bonus :(\n"
						+ "But we anyways will get his " + bonusTime(salary, bonus));
			}
		} catch (NumberFormatException | IOException e) {
			System.out.println("It seems that your input is invalid. Try again.");
		}
	}

	public static String bonusTime(final int salary, final boolean bonus) {
		return "\u00A3" + salary * (bonus ? 10 : 1);
	}
}
