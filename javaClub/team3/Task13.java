package javaClub.team3;

import java.io.IOException;

//https://www.codewars.com/kata/fixme-static-electrickery/
public class Task13 extends Task{


	  private static int ONE_HUNDRED = 100;
	  
	  public static final Task13 INST = new Task13();
	    
	  private final int value; 

	  private Task13() {
	    value = ONE_HUNDRED;
	  }
	  
	  public int plus100(int n) {
	    return value + n;

	  }
	  
	@Override
	void execute() {
		int n = 0;
		try {
			System.out.println("Please enter number: ");
			n = Integer.parseInt(bufferedReader.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.err.println("Not a number!");
		}
		System.out.println(plus100(n));
		
	}


		
}
