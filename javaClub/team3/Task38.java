package javaClub.team3;

import java.io.IOException;
import java.util.InputMismatchException;

//https://www.codewars.com/kata/how-good-are-you-really/
public class Task38 extends Task {

	public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
		if (classPoints == null || yourPoints < 0)
			throw new InputMismatchException();

		int sumPoints = 0;
		for (int i = 0; i < classPoints.length; i++) {
			if (classPoints[i] < 0)
				throw new InputMismatchException();
			sumPoints += classPoints[i];
		}
		return (double) (sumPoints / (classPoints.length + 1)) < yourPoints;
	}

	@Override
	void execute() {

		try {
			
			System.out.println("Please enter student count: ");
			int n = Integer.parseInt(bufferedReader.readLine());
			int [] arrAge = new int[n];
			for (int i = 0; i < arrAge.length; i++) {
				System.out.println("Please enter student "+ i +" point: ");
				arrAge[i] = Integer.parseInt(bufferedReader.readLine());
				  
			}
			System.out.println("Please enter your points: ");
			int yourPOint = Integer.parseInt(bufferedReader.readLine());
			System.out.println(betterThanAverage(arrAge, yourPOint));
	
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.err.println("Not a number!");
		}

	}

}
