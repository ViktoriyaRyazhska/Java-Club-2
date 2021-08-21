/* 
 * https://www.codewars.com/kata/return-negative
 */

package com.javaclub.team4.basicprogram;

import java.io.IOException;

import com.javaclub.team4.Task;

/* 
 * In this simple assignment you are given a number and have to make it negative.
 * But maybe the number is already negative?
 */

public class Task9 extends Task {
	
	private int n = 0;

	@Override
	public void runTask() {
		
		System.out.println("Please enter a non-negative number to transform it into binary format:");
		try {
			n = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			System.out.println("It seems that the number you entered is not an integer. Try again.");
		}
		System.out.println(n + " in binary is ");
	}

	public static int makeNegative(final int x) {

		int result = Math.abs(x) * -1;

		return result;
	}
}
