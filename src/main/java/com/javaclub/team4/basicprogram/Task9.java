/* 
 * https://www.codewars.com/kata/return-negative
 */

package com.javaclub.team4.basicprogram;

import com.javaclub.team4.Task;
import java.io.IOException;

/* 
 * In this simple assignment you are given a number and have to make it negative.
 * But maybe the number is already negative?
 */

public class Task9 extends Task {

	private int n = 0;

	@Override
	public void runTask() {

		System.out.println("\nThis is Task9. It should return a negative result of your input.\n");

		System.out.println("Please enter a number to transform it to negative one:");
		while (true) {
			try {
				n = Integer.parseInt(br.readLine());
				break;
			} catch (NumberFormatException | IOException e) {
				System.out.println("It seems that the number you entered is not valid. Try again:");
			}
		}

		System.out.println(makeNegative(n) + " is the result.");

		System.out.println("\nExiting to Main menu.\n");
	}

	public static int makeNegative(final int x) {

		int result = Math.abs(x) * -1;

		return result;
	}
}
