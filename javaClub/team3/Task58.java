package javaClub.team3;

import java.io.IOException;
import java.util.InputMismatchException;
//https://www.codewars.com/kata/triple-trouble-2/
public class Task58 extends Task {

	public static String tripleTrouble(String one, String two, String three)  {
		String returnString = "";

		if (!(one.length() == two.length()) && !(two.length() == three.length()))
			throw new InputMismatchException("Woreng length of string");
		for (int i = 0; i < one.length(); i++) {
			returnString += "" + one.charAt(i) + two.charAt(i) + three.charAt(i);
		}
		return returnString;
	}

	@Override
	void execute() {
		try {
			System.out.println("Please enter string 1");
			String n = bufferedReader.readLine();
			System.out.println("Please enter string 2");
			String c = bufferedReader.readLine();
			System.out.println("Please enter string 3");
			String s = bufferedReader.readLine();
			System.out.println(tripleTrouble(n, c, s));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
