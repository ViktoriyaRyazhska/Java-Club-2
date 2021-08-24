/*
 * https://www.codewars.com/kata/opposite-number
 */

package com.javaclub.team4.conditions;

import java.io.IOException;

import com.javaclub.team4.Task;

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
		
		int input;

		System.out.println("Please enter a number to transform it to opposite one:");

		try {
			input = Integer.parseInt(br.readLine());
			System.out.println("Opposite of " + input + " is " + opposite(input) + ".");
		} catch (NumberFormatException | IOException e) {
			System.out.println("It seems that the number you entered is not valid. Try again.");
		}
	}

	public static int opposite(int number) {
		return -number;
	}
}
