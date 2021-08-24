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
			// Task1.main(args);
			break;
		}
		case 2: {
			Task2.main(args);
			break;
		}
		case 3: {
			Task3.main(args);
			break;
		}
		case 4: {
			 Task4.main(args);
			break;
		}
		case 5: {
			// Task5.main(args);
			break;
		}
		case 6: {
			Task6.main(args);
			break;
		}
		case 7: {
			Task7.main(args);
			break;
		}
		case 8: {
			// Task8.main(args);
			break;
		}
		case 9: {
			// Task9.main(args);
			break;
		}
		case 10: {
			Task10.main(args);
			break;
		}
		case 11: {
			Task11.main(args);
			break;
		}
		
		

		}

		sc.close();

	}

}
