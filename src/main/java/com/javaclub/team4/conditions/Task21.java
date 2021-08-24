/*
 * https://www.codewars.com/kata/do-i-get-a-bonus
 */

package com.javaclub.team4.conditions;

import java.io.IOException;

import com.javaclub.team4.Task;

/*
It's bonus time in the big city! The fatcats are rubbing their paws in anticipation...
but who is going to make the most money?

Build a function that takes in two arguments (salary, bonus).
Salary will be an integer, and bonus a boolean.

If bonus is true, the salary should be multiplied by 10.
If bonus is false, the fatcat did not make enough money and must receive only his stated salary.

Return the total figure the individual will receive as a string prefixed with "£" (= "\u00A3", JS, Go, Java and Julia),
"$" (C#, C++, Ruby, Clojure, Elixir, PHP, Python, Haskell and Lua) or "¥" (Rust).
*/

public class Task21 extends Task {

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
