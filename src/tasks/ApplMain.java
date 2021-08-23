package tasks;

import java.util.Scanner;

public class ApplMain {
	public static void main(String[] args) {

		System.out.print("Hello! Input Task's number: ");
		int numTask = 0;

		Scanner sc = new Scanner(System.in);

		do {
			try {
				numTask = Integer.parseInt(sc.nextLine());

				break;
			} catch (Exception e) {

				System.out.print("Input integer number betwen 1 and 72: ");
			}

		} while (true);

		switch (numTask) {
		case 1: {
			break;
			
		}case 2: {
			break;
			
		}
		
		
		}

		sc.close();

	}

}
