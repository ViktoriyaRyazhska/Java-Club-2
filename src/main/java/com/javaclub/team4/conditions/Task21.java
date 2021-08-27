/*
 * https://www.codewars.com/kata/do-i-get-a-bonus
 */

package com.javaclub.team4.conditions;

import com.javaclub.team4.Task;
import java.io.IOException;

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

		System.out.println("\nThis is Task21 and it's bonus time in the big city!\n"
				+ "The fatcats are rubbing their paws in anticipation…\n"
				+ "But who is going to make the most money?\n");

		int salary;
		boolean bonus = false;
		
		System.out.println("Please enter how many \u00A3 does fatcat get as his salary:");
		while (true) {
			try {
				salary = Integer.parseInt(br.readLine());
				System.out.println(new StringBuilder().append("And enter \"y\" or \"n\" if it gets a bonus or not:"));
				String bonusInput = br.readLine();

				if (bonusInput.equalsIgnoreCase("y")) {
					bonus = true;
					System.out.println(
							"Yaaay! Catso got his premium " + bonusTime(salary, bonus) + " payout with bonus!!! :3");
					break;
				} else if (bonusInput.equalsIgnoreCase("n")) {
					System.out.println("No bonus this time. Only " + bonusTime(salary, bonus) + " as usual :C");
					break;
				} else {
					System.err.println("Looks like you've made a wrong entry & left catso without the bonus :(\n"
							+ "But he anyways gets his " + bonusTime(salary, bonus));
					break;
				}
			} catch (NumberFormatException | IOException e) {
				System.err.println("It seems that your input is invalid. Try again with integer value form 0 to "
						+ Integer.MAX_VALUE + ".");
			}
		}

		System.out.println("\nExiting to Main menu.\n");
	}

	public static String bonusTime(final int salary, final boolean bonus) {
		return "\u00A3" + salary * (bonus ? 10 : 1);
	}
}
