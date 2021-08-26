package javaClub.team3;

import java.io.IOException;
import java.util.InputMismatchException;

//https://www.codewars.com/kata/cat-years-dog-years/
public class Task33 extends Task {

	public static int[] humanYearsCatYearsDogYears(final int humanYears)  {
		int catYears = 0;
		int dogYears = 0;

		if (humanYears >= 1) {
			if (humanYears == 1) {
				catYears = 15;
				dogYears = 15;
			} else if (humanYears == 2) {
				catYears = 24;
				dogYears = 24;
			} else {
				catYears = humanYears * 4 + 16;
				dogYears = humanYears * 5 + 14;
			}
			return new int[] { humanYears, catYears, dogYears };
		}
		throw new InputMismatchException("Unknown value of human years");
	}

	@Override
	void execute() {

		try {
			System.out.println("Please enter human age: ");
			int n = Integer.parseInt(bufferedReader.readLine());
			int [] arrAge = humanYearsCatYearsDogYears(n);
			System.out.println("Human age: " + arrAge[0]);
			System.out.println("Cat age: " + arrAge[1]);
			System.out.println("Dog age: " + arrAge[2]);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.err.println("Not a number!");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
