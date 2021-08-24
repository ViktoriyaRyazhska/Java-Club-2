package tasks;

import java.util.Scanner;

/**
 *
 * Your task is to write a function that takes two parameters: the year of birth
 * and the year to count years in relation to. As Philip is getting more curious
 * every day he may soon want to know how many years it was until he would be
 * born, so your function needs to work with both dates in the future and in the
 * past.
 * 
 * Provide output in this format: For dates in the future: "You are ... year(s)
 * old." For dates in the past: "You will be born in ... year(s)." If the year
 * of birth equals the year requested return: "You were born this very year!"
 * 
 * "..." are to be replaced by the number, followed and proceeded by a single
 * space. Mind that you need to account for both "year" and "years", depending
 * on the result.
 * 
 * @author Taras Krasitskyi
 *
 */

public class Task22 {

	public static String CalculateAge(int birth, int yearTo) {
		if (birth == yearTo) {
			return "You were born this very year!";
		}
		if (yearTo < birth) {
			if ((birth - yearTo) > 1) {
				return "You will be born in " + (birth - yearTo) + " years.";
			} else {
				return "You will be born in " + (birth - yearTo) + " year.";
			}
		} else {
			if ((yearTo - birth) > 1) {
				return "You are " + (yearTo - birth) + " years old.";
			} else {
				return "You are " + (yearTo - birth) + " year old.";

			}

		}

	}
	
	public static void main(String[] args) {
		System.out.println("\tTask 22.\n\t\t*Your task is to write a function that takes two parameters: the year of birth\r\n" + 
				" \t\t* and the year to count years in relation to. As Philip is getting more curious\r\n" + 
				" \t\t* every day he may soon want to know how many years it was until he would be\r\n" + 
				" \t\t* born, so your function needs to work with both dates in the future and in the\r\n" + 
				" \t\t* past.\r\n" + 
				" \t\t* \r\n" + 
				" \t\t* Provide output in this format: For dates in the future: \"You are ... year(s)\r\n" + 
				" \t\t* old.\" For dates in the past: \"You will be born in ... year(s).\" If the year\r\n" + 
				" \t\t* of birth equals the year requested return: \"You were born this very year!\"\r\n" + 
				" \t\t* \r\n" + 
				" \t\t* \"...\" are to be replaced by the number, followed and proceeded by a single\r\n" + 
				" \t\t* space. Mind that you need to account for both \"year\" and \"years\", depending\r\n" + 
				" \t\t* on the result.\n");
		System.out.print("Input Birth Year: ");
		Scanner sc = new Scanner (System.in);
		int birthYear = 0;
		int yearTo = 0;
		do {
			try {
				birthYear = Integer.parseInt(sc.nextLine());
				break;
			}catch(Exception badYear) {
				System.out.println("Year must be integer. try again: ");
			}
		}while(true);
		System.out.print("Input Birth Year: ");
		do {
			try {
				yearTo = Integer.parseInt(sc.nextLine());
				break;
			}catch(Exception badYear) {
				System.out.println("Year must be integer. try again: ");
			}
		}while(true);
		
		System.out.println(CalculateAge(birthYear, yearTo));
		
	}

}
