package javaClub.team3;

import java.io.IOException;

//https://www.codewars.com/kata/century-from-year
public class Task8 extends Task{
	private int year;
	public static int century(int number) {
	    return (int)Math.ceil((double)number/100);
	  }

	@Override
	void execute() {
		try {
			System.out.println("Please enter year: ");
			year = Integer.parseInt(bufferedReader.readLine());
	
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.err.println("Not a number!");
		}
		System.out.println("Century: " + century(year));
		
	}
}
