/*
 * https://www.codewars.com/kata/opposite-number
 */

package com.javaclub.team4.conditions;

import com.javaclub.team4.Task;
import java.io.IOException;

/*
 * Very simple, given a number, find its opposite.
 * Examples:
 * 1: -1
 * 14: -14
 * -34: 34
 */

public class Task18 extends Task {

	@Override
	public void runTask() {

		System.out.println("\nThis is Task18. It returns a reverse result of your input.\n");

		int input;

		System.out.println("Please enter a number to transform it to opposite one:");
		while (true) {
			try {
				input = Integer.parseInt(br.readLine());
				break;
			} catch (NumberFormatException | IOException e) {
				System.out.println("It seems that your input is invalid. Try an integerbetween " + Integer.MIN_VALUE
						+ " and " + Integer.MAX_VALUE + ".");
			}
		}

		System.out.println("Opposite of " + input + " is " + opposite(input) + ".");

		System.out.println("\nExiting to Main menu.\n");
	}

	public static int opposite(int number) {

		return -number;
	}
}
