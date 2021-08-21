package javaClub.team3;

import java.io.IOException;

//https://www.codewars.com/kata/opposite-number/
public class Task18 extends Task{


    public static int opposite(int number)
    {
        return  number == 0 ? 0: -number;
    }
	  
	@Override
	void execute() {
		
		try {
			System.out.println("Please enter number: ");
			int n = Integer.parseInt(bufferedReader.readLine());
			System.out.println("Opposite: " + opposite(n));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.err.println("Not a number!");
		}
		
		
	}


		
}
