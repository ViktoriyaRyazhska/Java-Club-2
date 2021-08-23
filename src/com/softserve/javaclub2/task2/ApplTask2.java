package com.softserve.javaclub2.task2;

import java.util.Scanner;

public class ApplTask2 {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;

		System.out.print("Input number1:");
		Scanner sc = new Scanner(System.in);

		do {
			try {
				num1 = Integer.parseInt(sc.nextLine());
				break;
			} catch (Exception e) {
				System.out.println("Entered non-integer value!!!");
				System.out.print("Input valid integer value:");

			}
		} while (true);

		System.out.print("Input number2:");

		do {
			try {
				num2 = Integer.parseInt(sc.nextLine());
				break;
			} catch (Exception e) {
				System.out.println("Entered non-integer value!!!");
				System.out.print("Input valid integer value:");
			}
		} while (true);

		System.out.println("Myltyply "+num1+" * "+num2+" =  "+Task2.multiply(num1, num2));

		sc.close();

	}

}
