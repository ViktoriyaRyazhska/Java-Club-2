/*
 * https://www.codewars.com/kata/will-there-be-enough-space
 */

package com.javaclub.team4.conditions;

import com.javaclub.team4.Task;
import java.io.IOException;

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

		System.out.println("\nThis Task27 is about Bob who is working as a bus driver.\n"
				+ "However, he has become extremely popular amongst the city's residents.\n"
				+ "With so many passengers wanting to get aboard his bus, "
				+ "he sometimes has to face the problem of not enough space left on the bus!\n");

		int cap = 0;
		int on = 0;
		int wait = 0;

		System.out.println("For how many passengers do you think there is room in the bus:");
		while (true) {
			try {
				cap = Integer.parseInt(br.readLine());
				System.out.println("How many of them are occupied:");
				on = Integer.parseInt(br.readLine());
				System.out.println("And how many people are waing on the next bus stop:");
				wait = Integer.parseInt(br.readLine());
				if (enough(cap, on, wait) > 0) {
					System.out.println(enough(cap, on, wait) + " passengers are going to wait for the next bus.");
					break;
				} else {
					System.out.println("All fit into the Bob's bus! Hooray!");
					break;
				}
			} catch (ArithmeticException e) {
				System.err.println(e.getMessage());

			} catch (NumberFormatException | IOException e) {
				System.err.println("It seems that your input is invalid. Try integer numbers betwen "
						+ Integer.MIN_VALUE + " and " + Integer.MAX_VALUE + ":");
			}
		}

		System.out.println("\nExiting to Main menu.\n");
	}

	public static int enough(int cap, int on, int wait) throws ArithmeticException {

		if (on > cap) {
			throw new ArithmeticException("You can't have more passengers than there are seats.");
		}
		return Math.max(0, on + wait - cap);
	}
}
