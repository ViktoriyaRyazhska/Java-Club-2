package tasks;

import java.util.Scanner;

/**
 * 
 * Complete the method that takes a boolean value and return a "Yes" string for
 * true, or a "No" string for false.
 * 
 * @author Taras Krasitskyi
 *
 */

public class Task26 {

	public static String boolToWord(boolean b) {
		// TODO
		if (b) {
			return "Yes";
		} else {
			return "No";
		}
	}

	public static void main(String[] args) {
		System.out.print(
				"\tTask 26.\n\t\t* Complete the method that takes a boolean value and return a \"Yes\" string for\r\n"
						+ "\t\t* true, or a \"No\" string for false..\n");
		Scanner sc = new Scanner(System.in);
		boolean vBoolean = true;
		String inputString = "";
		System.out.print("\tInput boolean (true/false): ");

		do {
			try {
				inputString = sc.nextLine();
				if(inputString.equals("true") || inputString.equals("false")) {
					vBoolean = Boolean.parseBoolean(inputString);
				}else {
					throw new RuntimeException ("Error. Bad boolean!  ");
				}
				
				break;
			} catch (Exception badBoolean) {
				System.out.print("\t"+badBoolean.getMessage()+"Input \'true\' or \'false\': " );
			}
		} while (true);
		System.out.print("Result: " + Task26.boolToWord(vBoolean));

		sc.close();

	}

}
