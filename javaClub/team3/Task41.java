package javaClub.team3;

import java.util.InputMismatchException;
//https://www.codewars.com/kata/56f699cd9400f5b7d8000b55/solutions/java
public class Task41 extends Task{

	@Override
	void execute() {
		try {
		System.out.println("Please enter 1 part of body: ");
		String p1 = bufferedReader.readLine();
		System.out.println("Please enter 2 part of body: ");
		String p2 = bufferedReader.readLine();
		System.out.println("Please enter 3 part of body: ");
		String p3 = bufferedReader.readLine();
		System.out.println(fixTheMeerkat(new String[] {p1,p2, p3}));
		} catch (Exception e) {
			
		}
	}

	 public static String[] fixTheMeerkat(String[] arr) {
		 if (arr == null || arr.length != 3) throw new InputMismatchException();
		 return new String[]{ arr[2], arr[1], arr[0]};
	 }
}
