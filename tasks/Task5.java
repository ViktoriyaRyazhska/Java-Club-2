package java_core;

import java.util.Scanner;
import java.lang.String;

public class Task5 {
	public static String Greet(String name){
		if(name.equals("Johnny"))
			return "Hello, my love!";
		else
			return "Hello, " + name + "!";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = sc.nextLine();

		while (!name.matches("[a-zA-Z]+")) { // Check if it has anything other than alphabets
			System.out.println("This is not in letters only. Try again:");
			name = sc.nextLine(); // if not, ask the user to enter new first name
		}
//		int a = firstname.charAt(0); // once done, use this as you wish

		char [] charArray = name.toCharArray();
//		for (char element : charArray) {
//			if (element != ('A' | 'a' | 'B' | 'b' | 'C' | 'c' | 'D' | 'd' | 'E' | 'e'))
//		}
		name = name.substring(0, 1).toUpperCase() + name.substring(1);
		System.out.println(Greet(name));
	}
}