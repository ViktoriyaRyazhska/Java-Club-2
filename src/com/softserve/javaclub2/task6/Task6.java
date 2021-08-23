package com.softserve.javaclub2.task6;

import java.util.Scanner;

/**
 * 
 * Given a non-negative integer n, write a function to_binary/ToBinary which
 * returns that number in a binary format.
 * 
 * @author Taras Krasitskyi
 *
 */

public class Task6 {

	public static int toBinary(int n) {
		try {
			String intToBinary = Integer.toBinaryString(n);
			return Integer.parseInt(intToBinary);

		} catch (Exception e) {
			System.out.println("Something wrong");
			return e.hashCode();
		}
		
		

	}

	public static void main(String[] args) {
		System.out.print("Input Integer number: ");
		Scanner sc = new Scanner(System.in);
		int num = 0;
		do {

			try {
				num = Integer.parseInt(sc.nextLine());
				if(num<0) {
					System.out.print("Number must be non-integer! Try again: ");
					continue;
					
				}
				break;
			} catch (Exception badNumber) {
				System.out.print("Bad number. Number must be non-integer! Try again: ");
			}
		} while (true);

		System.out.print("Number in binary: " + toBinary(num));

		sc.close();

	}

}
