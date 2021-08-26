package javaClub.team3;

import java.io.IOException;
import java.util.InputMismatchException;
//https://www.codewars.com/kata/welcome-to-the-city/
public class Task53 extends Task {
	public String sayHello(String[] name, String city, String state) {
		if (name == null || state == null) throw new InputMismatchException();
		return String.format("Hello %s! Welcome to %s, %s!", String.join(" ", name), city, state);
	}

	@Override
	void execute() {
		try {

			System.out.println("Please enter your full name ");
			String n = bufferedReader.readLine();
			System.out.println("Please enter your City ");
			String c = bufferedReader.readLine();
			System.out.println("Please enter your State ");
			String s = bufferedReader.readLine();
			System.out.println(sayHello(n.split(" "), c, s));

		} catch (IOException e) {
			e.printStackTrace();
		} 

	}
}
