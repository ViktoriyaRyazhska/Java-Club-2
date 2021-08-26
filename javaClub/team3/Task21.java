package javaClub.team3;

import java.io.IOException;
import java.util.InputMismatchException;
//https://www.codewars.com/kata/do-i-get-a-bonus/
public class Task21 extends Task{

	@Override
	void execute() {
		try {
			System.out.println("Please enter salary: ");
			int n = Integer.parseInt(bufferedReader.readLine());
			System.out.println("Do bonus ?(y/n): ");
			String bonus = bufferedReader.readLine();
			System.out.println(bonusTime(n, bonus.equals("y")));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.err.println("Not a number!");
		}
		
	}

	 public static String bonusTime(final int salary, final boolean bonus) {
		 if (salary < 0) throw new InputMismatchException();   
		 return "£" + (bonus ? salary * 10 : salary);
	}
}
