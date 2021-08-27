package javaClub.team3;

import java.io.IOException;
import java.util.InputMismatchException;
//https://www.codewars.com/kata/parse-nice-int-from-char-problem/
public class Task61 extends Task{

	@Override
	void execute() {
		try {

			System.out.println("Enter yout text: ");
			String text = bufferedReader.readLine();
			System.out.println(howOld(text));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.err.println("Not a number!");
		}
	}
	  public static int howOld(final String herOld) {
		  if (herOld == null) throw new InputMismatchException();
		  	return Integer.valueOf("" + herOld.charAt(0));
		  
	  }
	
}
