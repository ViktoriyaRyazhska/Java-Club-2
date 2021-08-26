package javaClub.team3;

import java.io.IOException;

//https://www.codewars.com/kata/rock-paper-scissors/
public class Task23 extends Task {
	private String p1, p2;
	private static String result;

	public static String rps(String p1, String p2) {
		if (p1.equals(p2))
			return "Draw!";

		if (p1.equals("scissors")) {
			if (p2.equals("paper"))
				setResult(1);
			else
				setResult(2);

		} else if (p1.equals("paper")) {
			if (p2.equals("rock"))
				setResult(1);
			else
				setResult(2);
		} else {
			if (p2.equals("scissors"))
				setResult(1);
			else
				setResult(2);
		}
		return result;
	}

public static void setResult(int playerNumber) {
		result = "Player " + playerNumber + " won!";
		
	}

	@Override
	void execute() {
		
		try {
			System.out.println("Please enter player 1: ");
			p1 = bufferedReader.readLine();
			System.out.println("Please enter player 2: ");
			p2 = bufferedReader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		System.out.println(rps(p1, p2));

	}

}
