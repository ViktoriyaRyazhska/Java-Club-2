package javaClub.team3;

import java.io.IOException;

//https://www.codewars.com/kata/the-modulo-3-sequence/
public class Task28 extends Task {

	public static int sequence(int n) {
		int prevNumb = 0;
		int resoult = 1;
		if (1 <= n) {
			for (int i = 2; i < n; i++) {
				int tmp_val = (resoult + prevNumb);
				prevNumb = resoult;
				resoult = tmp_val % 3;
			}
			return resoult;
		}
		return 0;
	}

	@Override
	void execute() {
		
		try {
			System.out.println("Please enter number: ");
			int n = Integer.parseInt(bufferedReader.readLine());
			System.out.println(sequence(n));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.err.println("Not a number!");
		}
		

	}

}
