package java_core;

import java.util.Scanner;

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
		System.out.println(Greet(name));
	}
}