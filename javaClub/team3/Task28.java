package javaClub.team3;

import java.io.IOException;
import java.util.InputMismatchException;

//https://www.codewars.com/kata/the-modulo-3-sequence/
public class Task28 extends Task {

	public static int sequence(int n)  {
		
		if (n < 1 || n > Integer.MAX_VALUE) throw new InputMismatchException("The number is out of diapasone");
		
		if (n % 8 == 2 || n % 8 == 3 || n % 8 == 0)	return 1;

		if (n % 8 == 4 || n % 8 == 6 || n % 8 == 7)	return 2;

		if (n % 8 == 1 || n % 8 == 5) return 0;
		
		throw new InputMismatchException("Unknown number value");
	}

	@Override
	void execute() {

		try {
			System.out.println("Please enter number: ");
			int n = Integer.parseInt(bufferedReader.readLine());
			System.out.println(sequence(n));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.err.println("Not a number!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
