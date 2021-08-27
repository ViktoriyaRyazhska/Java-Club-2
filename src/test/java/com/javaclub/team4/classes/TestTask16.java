package com.javaclub.team4.classes;

import java.util.Random;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.javaclub.team4.classes.Task16.Fighter;

public class TestTask16 {

	@Test
	public void basicTests() {
		assertEquals("Lew", Task16.declareWinner(new Fighter("Lew", 10, 2), new Fighter("Harry", 5, 4), "Lew"));
		assertEquals("Harry", Task16.declareWinner(new Fighter("Lew", 10, 2), new Fighter("Harry", 5, 4), "Harry"));
		assertEquals("Harald", Task16.declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harry"));
		assertEquals("Harald",
				Task16.declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harald"));
		assertEquals("Harald",
				Task16.declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Jerry"));
		assertEquals("Harald",
				Task16.declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Harald"));
	}

	@Test
	public void randomTests() {
		String[] names = { "Willy", "Johnny", "Max", "Lui", "Marco", "Bostin", "Loyd", "Mark", "Cuban", "Lew", "Rocky",
				"Mario", "David", "Patrick", "Michael" };
		Random r = new Random();
		for (int i = 0; i < 200; i++) {
			String[] name = { names[r.nextInt(names.length)], names[r.nextInt(names.length)] };
			while (name[0].equals(name[1])) {
				name[1] = names[r.nextInt(names.length)];
			}
			int[] health = { r.nextInt(999) + 1, r.nextInt(999) + 1 },
					damagePerAttack = { r.nextInt(99) + 1, r.nextInt(99) + 1 };
			String first = name[r.nextInt(1)];
			assertEquals(
					solution(new Fighter(name[0], health[0], damagePerAttack[0]),
							new Fighter(name[1], health[1], damagePerAttack[1]), first),
					Task16.declareWinner(new Fighter(name[0], health[0], damagePerAttack[0]),
							new Fighter(name[1], health[1], damagePerAttack[1]), first));
		}
	}

	public static String solution(Fighter fighter1, Fighter fighter2, String firstAttacker) throws ArithmeticException {

		if (fighter1.getDamagePerAttack() <= 0 || fighter2.getDamagePerAttack() <= 0) {
			throw new ArithmeticException();
		} else {
			int turns1 = fighter2.getHealth() / fighter1.getDamagePerAttack();
			int turns2 = fighter1.getHealth() / fighter2.getDamagePerAttack();
			return (turns1 > turns2) ? fighter2.getName() : (turns1 < turns2) ? fighter1.getName() : firstAttacker;
		}
	}
}
