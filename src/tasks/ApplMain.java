package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ApplMain {
	
	public static void main(String[] args) throws IOException {
		int numTask = 0;
		String inputAnswer = "";
		boolean check = true;
		// Scanner scan = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.print("Hello! Input Task's number: ");
			do {
				try {
					numTask = Integer.parseInt(br.readLine());

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
				Task8.main(args);
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
				// Task10.main(args);
				break;
			}

			case 12: {
				Task12.main(args);
				break;
			}
			case 13: {
				// Task13.main(args);
				break;
			}
			case 14: {
				// Task14.main(args);
				break;
			}
			case 15: {
				Task15.main(args);
				break;
			}
			case 16: {
				Task16.main(args);
				break;
			}
			case 17: {
				// Task11.main(args);
				break;
			}
			case 18: {
				Task18.main(args);
				break;
			}
			case 19: {
				// Task19.main(args);
				break;
			}
			case 20: {
				Task20.main(args);
				break;
			}
			case 21: {
				// Task21.main(args);
				break;
			}
			case 22: {
				Task22.main(args);

				break;
			}
			case 23: {
				// Task23.main(args);
				break;
			}
			case 24: {
				// Task24.main(args);
				break;
			}
			case 25: {
				// Task25.main(args);
				break;
			}
			case 26: {
				Task26.main(args);
				break;
			}
			case 27: {
				// Task27.main(args);
				break;
			}
			case 28: {
				// Task28.main(args);
				break;
			}
			case 29: {
				// Task29.main(args);
				break;
			}
			case 30: {
				Task30.main(args);
				break;
			}
			case 31: {
				// Task22.main(args);
				break;
			}
			case 32: {
				// Task32.main(args);
				break;
			}
			case 33: {
				// Task33.main(args);
				break;
			}
			case 34: {
				Task34.main(args);
				break;
			}
			case 35: {
				// Task35.main(args);
				break;
			}
			case 36: {
				// Task36.main(args);
				break;
			}
			case 37: {
				// Task37.main(args);
				break;
			}
			case 38: {
				// Task38.main(args);
				break;
			}
			case 39: {
				// Task39.main(args);
				break;
			}
			case 40: {
				// Task40.main(args);
				break;
			}
			}

			System.out.print("\tDo you want continue? (Y/N): ");
			do {

				try {
					inputAnswer = br.readLine();
					if (inputAnswer.equals("Y") || inputAnswer.equals("N")) {
						check = true;
					} else {
						throw new RuntimeException("Error. Bad answer!  ");
					}

					break;
				} catch (Exception badAnswer) {
					System.out.print("\t" + badAnswer.getMessage() + " Input \'Y\' or \'N\': ");
				}

			} while (true);

			if (inputAnswer.equals("N")) {
				check = false;
				System.out.print("\tApplication terminated!");
			}

		} while (check);

		 br.close();


	}

}
