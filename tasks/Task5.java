package java_core;

import java.util.Scanner;

public class Task5 {
	public static String Greet(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = sc.nextLine();

		while (!name.matches("[a-zA-Z]+")) {   //перевіряє на наявність чогось крім букв
			System.out.println("This is not in letters only. Try again:");
			name = sc.nextLine();
		}

		name = name.substring(0, 1).toUpperCase() + name.substring(1); //робить першу літеру веливою

		if(name.equals("Johnny"))
			return "Hello, my love!";
		else
			return "Hello, " + name + "!";
	}

	public static void main(String[] args) {
		System.out.println(Greet());
	}
}