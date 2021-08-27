package javaClub.team3;

import java.io.IOException;
import java.util.InputMismatchException;

//https://www.codewars.com/kata/find-nearest-square-number/
public class Task43 extends Task {

	  public static int nearestSq(final int n) {

			if (n < 0)
				throw new InputMismatchException("The number is less than 0");

			double result = Math.round(Math.sqrt(n));

			return (int) (result * result);
 
	  }

	@Override
	void execute() {

		try {
			
			System.out.println("Please enter number: ");
			int n = Integer.parseInt(bufferedReader.readLine());
			System.out.println("Number is " + nearestSq(n));	
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.err.println("Not a number!");
		}catch(Exception e){
	         
	        System.out.println(e.getMessage());
		}

	}

}
