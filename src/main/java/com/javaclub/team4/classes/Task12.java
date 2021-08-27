/* 
 * https://www.codewars.com/kata/lombok-encapsulation
 */

package com.javaclub.team4.classes;

import com.javaclub.team4.Task;
import lombok.*;

/*
 * In Java, we have a very powerful library named Lombok. It helps to reduce the boilerplate code.
 *
 * This Kata is a challenge created for you to learn how to use Lombok.
 *
 * Giving the following class:
 *
 * public class EncapsulationDemo{
 * public int number;
 * public String stringValue;
 * public Object anObject;
 * }
 * We have to do the following modifications to properly encapsulate info:
 * 
 * make fields private
 * provide accessors to the internal fields ( setters/getters )
 * provide an empty constructor to support Java Beans specification
 * Add a constructor that can receive parameters for all of the fields
 * Note: make sure if you don't use Lombok to enforce proper naming conventions.
 */

@NoArgsConstructor
@AllArgsConstructor
public class Task12 extends Task {

	private @Getter @Setter int number;
	private @Getter @Setter String stringValue;
	private @Getter @Setter Object anObject;

	@Override
	public void runTask() {

		System.out.println(
				"This is Task12 and it just tests if lombok annotation library has been used. I used it! I honestly did!");

		System.out.println("\nExiting to Main menu.\n");
	}
}
