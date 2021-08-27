package javaClub.team3;
//https://www.codewars.com/kata/two-fighters-one-winner/

import java.util.InputMismatchException;
import java.util.Scanner;

/* @Test
 * call Kata.declareWinner
 *
 * use newFighter with params as param in declareWinner
 *
 * Exceptions:
 * InputMismatchException when name is empty
 * InputMismatchException when health/dmg <= 0
 * InputMismatchException when firstAttacker name doesn't exist as fighters names
 */
public class Task16 extends Task{
    @Override
    void execute() { //I know about duplicates :)
        Scanner scanner = new Scanner(System.in);
        String f1_name, f2_name, firstAttacker;
        int f1_health, f2_health, f1_dmg, f2_dmg;

        System.out.println("Fighter1:");
        System.out.println("Print name");
        try {
            f1_name = scanner.nextLine();
            if (f1_name.length() == 0) throw new InputMismatchException();
        } catch (InputMismatchException e) {
            System.err.println("Incorrect input");
            return;
        }
        System.out.println("Print health");
        try {
            f1_health = scanner.nextInt();
            if (f1_health <= 0) throw new InputMismatchException();
        } catch (InputMismatchException e) {
            System.err.println("Incorrect input");
            return;
        }
        System.out.println("Print damage");
        try {
            f1_dmg = scanner.nextInt();
            if (f1_dmg <= 0) throw new InputMismatchException();
        } catch (InputMismatchException e) {
            System.err.println("Incorrect input");
            return;
        }

        System.out.println("Fighter2:");
        System.out.println("Print name");
        try {
            f2_name = scanner.nextLine();
            if (f2_name.length() == 0) throw new InputMismatchException();
        } catch (InputMismatchException e) {
            System.err.println("Incorrect input");
            return;
        }
        System.out.println("Print health");
        try {
            f2_health = scanner.nextInt();
            if (f2_health <= 0) throw new InputMismatchException();
        } catch (InputMismatchException e) {
            System.err.println("Incorrect input");
            return;
        }
        System.out.println("Print damage");
        try {
            f2_dmg = scanner.nextInt();
            if (f2_dmg <= 0) throw new InputMismatchException();
        } catch (InputMismatchException e) {
            System.err.println("Incorrect input");
            return;
        }

        System.out.println("Print first attacker`s name");
        try {
            firstAttacker = scanner.nextLine();
            if (firstAttacker.length() == 0) throw new InputMismatchException();
            if (!firstAttacker.equals(f1_name) && !firstAttacker.equals(f2_name))
                throw new InputMismatchException("No fighter with that name");
        } catch (InputMismatchException e) {
            System.err.println("Incorrect input");
            return;
        }

        System.out.println(Kata.declareWinner(
                new Kata.Fighter(f1_name, f1_health, f1_dmg),
                new Kata.Fighter(f2_name, f2_health, f2_dmg),
                firstAttacker));
    }
    public static class Kata {
        public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
            if (fighter1.name.length() == 0) throw new InputMismatchException();
            if (fighter2.name.length() == 0) throw new InputMismatchException();
            if (fighter1.health <= 0) throw new InputMismatchException();
            if (fighter2.health <= 0) throw new InputMismatchException();
            if (fighter1.damagePerAttack <= 0) throw new InputMismatchException();
            if (fighter2.damagePerAttack <= 0) throw new InputMismatchException();
            if (!firstAttacker.equals(fighter1.name) && !firstAttacker.equals(fighter2.name))
                throw new InputMismatchException("No fighter with that name");

            boolean fatr = (firstAttacker.equals(fighter1.name));
            while (true) {
                if (fatr) {
                    fighter2.health -= fighter1.damagePerAttack;
                    fatr = false;
                } else {
                    fighter1.health -= fighter2.damagePerAttack;
                    fatr = true;
                }
                if (fighter1.health <= 0) return fighter2.name;
                if (fighter2.health <= 0) return fighter1.name;
            }
        }

        public static class Fighter {
            public String name;
            public int health, damagePerAttack;
            public Fighter(String name, int health, int damagePerAttack) {
                this.name = name;
                this.health = health;
                this.damagePerAttack = damagePerAttack;
            }
        }
    }
}
