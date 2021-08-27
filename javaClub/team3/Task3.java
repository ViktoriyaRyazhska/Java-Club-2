package javaClub.team3;

import java.io.IOException;
import java.util.InputMismatchException;

//https://www.codewars.com/kata/volume-of-a-cuboid/
public class Task3 extends Task {
	private double length, width, height;

	public static double getVolumeOfCuboid(final double length, final double width, final double height) {
		if (length <= 0 || width <=0 || height <=0 ) throw new InputMismatchException();
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
