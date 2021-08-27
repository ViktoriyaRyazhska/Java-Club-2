/*
 * https://www.codewars.com/kata/thinkful-logic-drills-traffic-light
 */

package com.javaclub.team4.conditions;

import com.javaclub.team4.Task;
import java.io.IOException;

/*
You're writing code to control your town's traffic lights.
You need a function to handle each change from green, to yellow, to red, and then to green again.

Complete the function that takes a string as an argument representing the current state of the light
and returns a string representing the state the light should change to.

For example, update_light('green') should return 'yellow'.
*/

public class Task30 extends Task {

	String light;

	@Override
	public void runTask() {
		
		System.out.println("\nThis is Task30 and it tells you the next color of a traffic light.\n");

		System.out.println("Please enter the current color of a traffic light to know which one should light up next:");
		while (true) {
			try {
				light = updateLight(br.readLine());
			} catch (IOException e) {
				System.err.println("Invalid input :( Try again.");
			}
			if (light.equals("error")) {
				System.err.println("There's no such color. Try red, green, or yellow:");
			} else {
				System.out.println("The next traffic light color would be " + updateLight(light) + ".");
				break;
			}
		}
		
		System.out.println("\nExiting to Main menu.\n");
	}

	public static String updateLight(String current) {
		return current.equalsIgnoreCase("green") ? "yellow"
				: current.equalsIgnoreCase("yellow") ? "red" : current.equalsIgnoreCase("red") ? "green" : "error";
	}
}
