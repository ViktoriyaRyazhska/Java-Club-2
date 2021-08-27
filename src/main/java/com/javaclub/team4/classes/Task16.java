/*
 * https://www.codewars.com/kata/simple-drawing-board
 */

package com.javaclub.team4.classes;

import com.javaclub.team4.Task;
import java.io.IOException;
import lombok.Getter;
import lombok.Setter;

/*
Create a function that returns the name of the winner in a fight between two fighters.

Each fighter takes turns attacking the other and whoever kills the other first is victorious.
Death is defined as having health <= 0.

Each fighter will be a Fighter object/instance. See the Fighter class below in your chosen language.

Both health and damagePerAttack (damage_per_attack for python) will be integers larger than 0.
You can mutate the Fighter objects.

Example:
public class Fighter {
  public String name;
  public int health, damagePerAttack;
  public Fighter(String name, int health, int damagePerAttack) {
    this.name = name;
    this.health = health;
    this.damagePerAttack = damagePerAttack;
  }
}
*/

public class Task16 extends Task {

	static class Fighter {
		private @Setter @Getter String name;
		private @Setter @Getter int health;
		private @Setter @Getter int damagePerAttack;

		public Fighter(String name, int health, int damagePerAttack) {
			this.name = name;
			this.health = health;
			this.damagePerAttack = damagePerAttack;
		}
	}

	public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker)
			throws ArithmeticException {

		if (fighter1.getDamagePerAttack() <= 0 || fighter2.getDamagePerAttack() <= 0) {
			throw new ArithmeticException();
		} else {
			int turns1 = (fighter2.getHealth() + fighter1.getDamagePerAttack() - 1) / fighter1.getDamagePerAttack();
			int turns2 = (fighter1.getHealth() + fighter2.getDamagePerAttack() - 1) / fighter2.getDamagePerAttack();
			return (turns1 > turns2) ? fighter2.getName() : (turns1 < turns2) ? fighter1.getName() : firstAttacker;
		}
	}

	@Override
	public void runTask() {

		System.out.println("\nThis is Task16. It models a sparring of two fighters.\n");

		// Created two instances of a class.
		Fighter fighter1 = new Fighter(null, 0, 0);
		Fighter fighter2 = new Fighter(null, 0, 0);

		// Filling fields of the first attacker.
		System.out.println("Please enter parameters of the first Fighter.\nName:");
		try {
			fighter1.setName(br.readLine());
		} catch (IOException e) {
			System.err.println("Wrong input.");
		}

		System.out.println("Health:");
		while (true) {
			try {
				fighter1.setHealth(Integer.parseInt(br.readLine()));
				break;
			} catch (NumberFormatException | IOException e) {
				System.err.println("Wrong input. Try integer values between 0 and " + Integer.MAX_VALUE + ":");
			}
		}

		System.out.println("And damage per attack:");
		while (true) {
			try {
				fighter1.setDamagePerAttack(Integer.parseInt(br.readLine())); // handle ArithmeticException /0
				break;
			} catch (NumberFormatException | IOException e) {
				System.err.println("Wrong input. Try integer values between 0 and " + Integer.MAX_VALUE + ":");
			}
		}

		// Filling fields of the second attacker.
		System.out.println("Now the second one.\nName:");
		while (true) {
			try {
				String s = br.readLine();
				if (!fighter1.getName().equals(s)) {
					fighter2.setName(s);
					break;
				} else {
					System.err.println("Name is already occupied, pick another one:");
				}

			} catch (IOException e) {
				System.err.println("Wrong input.");
			}
		}

		System.out.println("Health:");
		while (true) {
			try {
				fighter2.setHealth(Integer.parseInt(br.readLine()));
				break;
			} catch (NumberFormatException | IOException e) {
				System.err.println("Wrong input. Try integer values between 0 and " + Integer.MAX_VALUE + ":");
			}
		}

		System.out.println("And damage per attack:");
		while (true) {
			try {
				fighter2.setDamagePerAttack(Integer.parseInt(br.readLine()));
				break;
			} catch (NumberFormatException | IOException e) {
				System.err.println("Wrong input. Try integer values between 0 and " + Integer.MAX_VALUE + ":");
			}
		}

		// Defining first attacker.
		System.out
				.println("Who was the first one to attack? " + fighter1.getName() + " or " + fighter2.getName() + "?");
		while (true) {
			try {
				String firstAttacker = br.readLine();
				if (!firstAttacker.equals(fighter1.getName()) && !firstAttacker.equals(fighter2.getName())) {
					System.err.println("There is no attacker with such name. Try again:");
				} else {
					System.out
							.println("And the winner is: " + declareWinner(fighter1, fighter2, firstAttacker) + "!!!");
					break;
				}
			} catch (IOException e) {
				System.err.println("Wrong input.");
			} catch (ArithmeticException e) {
				System.err.println("Looks like you've got some weak fighters :( Level up their attack first.");
				break;
			}
		}
		
		System.out.println("\nExiting to Main menu.\n");
	}
}
