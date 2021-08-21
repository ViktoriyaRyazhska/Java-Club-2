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
		
		System.out.println("Please enter a number to transform it to negative one:");
		try {
			n = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			System.out.println("It seems that the number you entered is not valid. Try again.");
		}
		System.out.println(makeNegative(n) + " is the resul.");
	}

	public static int makeNegative(final int x) {

		int result = Math.abs(x) * -1;

		return result;
	}
}
