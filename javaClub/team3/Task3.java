package javaClub.team3;

import java.io.IOException;

//https://www.codewars.com/kata/volume-of-a-cuboid/
public class Task3 extends Task {
	private double length, width, height;

	public static double getVolumeOfCuboid(final double length, final double width, final double height) {
		return length * width * height;
	}

	@Override
	void execute() {

		try {
			System.out.println("Please enter length: ");
			length = Double.parseDouble(bufferedReader.readLine());
			System.out.println("Please enter width: ");
			width = Double.parseDouble(bufferedReader.readLine());
			System.out.println("Please enter height: ");
			height = Double.parseDouble(bufferedReader.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.err.println("Not a number!");
		}
		System.out.println("Volume: " + getVolumeOfCuboid(length, width, height));

	}
}
