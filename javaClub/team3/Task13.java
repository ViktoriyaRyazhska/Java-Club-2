package javaClub.team3;

import java.io.IOException;
import java.util.InputMismatchException;

//https://www.codewars.com/kata/fixme-static-electrickery/
public class Task13 extends Task{


	  private static int ONE_HUNDRED = 100;

	  public static final Task13 INST = new Task13();

	  private final int value;

	  public Task13() {
	    value = ONE_HUNDRED;
	  }

	  public int plus100(int n) {
		if (Integer.MAX_VALUE - 101 < n) throw new InputMismatchException();
	    return value + n;

	  }
	  
	@Override
	void execute() {
		
		try {
			System.out.println("Please enter number: ");
			int n = Integer.parseInt(bufferedReader.readLine());
			System.out.println(plus100(n));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.err.println("Not a number!");
		}
		
		
	}

}
