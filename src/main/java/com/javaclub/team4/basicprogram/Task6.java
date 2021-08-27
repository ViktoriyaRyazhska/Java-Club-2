/*
 * https://www.codewars.com/kata/convert-to-binary
 */

package com.javaclub.team4.basicprogram;

import com.javaclub.team4.Task;
import java.io.IOException;

/*
 * Given a non-negative integer n, write a function to_binary/ToBinary which returns that number in a binary format.
 * 
 * to_binary(1)  // should return 1
 * to_binary(5)  // should return 101
 * to_binary(11) // should return 1011
 */

public class Task6 extends Task {

	private int n = 0;

	@Override
	public void runTask() {

		System.out.println("\nThis is Task6. It converts an integer to binary.\n");

		System.out.println("Please enter a non-negative integer to transform it into binary format:");
		while (true) {
			try {
				n = Integer.parseInt(br.readLine());
				break;
			} catch (NumberFormatException | IOException e) {
				System.out.println("It seems that the number you entered is not an integer. Try again:");
			}
		}

		System.out.println(n + " in binary is " + toBinary(n));

		System.out.println("\nExiting to Main menu.\n");
	}

	public static int toBinary(int n) {

		return n = Integer.parseUnsignedInt(Integer.toBinaryString(n));
	}
}
