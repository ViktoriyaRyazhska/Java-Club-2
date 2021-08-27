/*
 * https://www.codewars.com/kata/volume-of-a-cuboid
 */

package com.javaclub.team4.basicprogram;

import com.javaclub.team4.Task;
import java.io.IOException;

/*
 * Bob needs a fast way to calculate the volume of a cuboid with three values:
 * length, width and the height of the cuboid.
 * Write a function to help Bob with this calculation.
 */

public class Task3 extends Task {

	private double length;
	private double width;
	private double height;

	@Override
	public void runTask() {

		System.out.println("\nThis is Task3. It calcualtes the volume of cuboid.\n");

		System.out.println("Please input parameters to calculate the volume of a cuboid.");
		while (true) {
			try {
				System.out.println("Length:");
				length = Double.parseDouble(br.readLine());
				System.out.println("Width:");
				width = Double.parseDouble(br.readLine());
				System.out.println("Height:");
				height = Double.parseDouble(br.readLine());
				break;
			} catch (NumberFormatException | IOException e) {
				System.err.println("It seems that the number you entered is not an integer. Try again:");
			}
		}

		System.out.println("The volume of such cuboid is " + getVolumeOfCuboid(length, width, height));

		System.out.println("\nExiting to Main menu.\n");
	}

	public static double getVolumeOfCuboid(final double length, final double width, final double height) {

		return length * width * height;
	}
}
