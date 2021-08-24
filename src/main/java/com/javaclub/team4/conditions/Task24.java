/*
 * https://www.codewars.com/kata/basic-mathematical-operations
 */

package com.javaclub.team4.conditions;

import java.io.IOException;

import com.javaclub.team4.Task;

/*
Your task is to create a function that does four basic mathematical operations.

The function should take three arguments - operation(string/char), value1(number), value2(number).
The function should return result of numbers after applying the chosen operation.

Examples
basicOp('+', 4, 7)         // Output: 11
basicOp('-', 15, 18)       // Output: -3
basicOp('*', 5, 5)         // Output: 25
basicOp('/', 49, 7)        // Output: 7
*/

public class Task24 extends Task {

	private int v1;
	private int v2;
	private String op;

	@Override
	public void runTask() {

		System.out.println(
				"This program is a basic calculator with addition, subtraction, multiplication, or division operations made with two numbers.\n"
						+ "Please enter the first number:");
		try {
			v1 = Integer.parseInt(br.readLine());
			System.out.println("Now the second one:");
			v2 = Integer.parseInt(br.readLine());

			System.out.println("And the operation you would like to perform, in format of +, -, *, or /:");
			op = br.readLine();
			System.out.println("Reult is: " + basicMath(op, v1, v2));
		} catch (NumberFormatException e) {
			System.out.println("Only integers are allowed.");
		} catch (IllegalArgumentException e) {
			System.out.println("Illegal operation: " + op);
		} catch (IOException e) {
			System.out.println("It seems your input is invalid.");
		} catch (ArithmeticException e) {
			System.out.println("Division by zero is allowed. But maybe in some other universe (^_^)");
		}
	}

	public static Integer basicMath(String op, int v1, int v2) throws IllegalArgumentException, ArithmeticException {

		switch (op) {
		case "+":
			return v1 + v2;
		case "-":
			return v1 - v2;
		case "*":
			return v1 * v2;
		case "/":
			if (v2 == 0) {
				throw new ArithmeticException();
			} else {
				return v1 / v2;
			}
		default:
			throw new IllegalArgumentException();
		}
	}
}
