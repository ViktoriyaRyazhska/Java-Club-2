package javaClub.team3;

import java.io.IOException;
import java.util.InputMismatchException;
//https://www.codewars.com/kata/exclamation-marks-series-number-6-remove-n-exclamation-marks-in-the-sentence-from-left-to-right/
public class Task68 extends Task {
	
	public static String remove(String s, int n) {
		if (s == null) throw new InputMismatchException();
		char chars[] = s.toCharArray();
		String resString = "";
		for (int i = 0; i < s.length(); i++) {

			if (String.valueOf(chars[i]).equals("!")) {
				if (n != 0) {
					n--;
					continue;
				}
			}
			resString += chars[i];
		}
		return resString;

	}

	@Override
	void execute() {
		try {

			System.out.println("Please enter the string");
			String s = bufferedReader.readLine();
			System.out.println("Please enter the number ");
			int n = Integer.parseInt(bufferedReader.readLine());
			System.out.println(remove(s,n));

		} catch (IOException e) {
			e.printStackTrace();
		} 

	}

}
