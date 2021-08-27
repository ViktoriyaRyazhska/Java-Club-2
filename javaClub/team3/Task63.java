package javaClub.team3;

import java.io.IOException;
import java.util.InputMismatchException;

//https://www.codewars.com/kata/abbreviate-a-two-word-name/
public class Task63 extends Task {

	public static String abbrevName(String name) {
		if (name == null)
			throw new InputMismatchException();
		String arr[] = name.split(" ");
		if (arr.length != 2)
			throw new InputMismatchException();
		return String.format("%s.%s", arr[0].charAt(0), arr[1].charAt(0)).toUpperCase();
	}

	@Override
	void execute() {
		try {

			System.out.println("Please enter your full name ");
			String n = bufferedReader.readLine();

			System.out.println(abbrevName(n));

		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}

}
