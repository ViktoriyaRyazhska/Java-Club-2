package tasks;

import java.util.Scanner;

public class Task16 {

    public static void main(String[] args) {

        System.out.print("\tTask 16.\n\t\tTwo fighters, one winner\n");
        System.out.println("Create a function that returns the name of the winner in a fight between two fighters.\n" +
                "Each fighter takes turns attacking the other and whoever kills the other first is victorious.\n" +
                "Death is defined as having health <= 0. Each fighter will be a Fighter object/instance. \n" +
                "Both health and damagePerAttack will be integers larger than 0.\n");

        Fighter fighter1 = new Fighter("Ihor", 10, 5);
        Fighter fighter2 = new Fighter("Vasyl", 10, 5);
        System.out.println("Available fighters: ");
        System.out.println("Name: " + fighter1.name + " | " + "Health: " + fighter1.health + " | " + "Damage per attack: " + fighter1.damagePerAttack);
        System.out.println("Name: " + fighter2.name + " | " + "Health: " + fighter2.health + " | " + "Damage per attack: " + fighter2.damagePerAttack);
        System.out.print("Enter a name of the attacker: ");
        Scanner sc = new Scanner(System.in);
        String name;
        do {
            try {
                name = sc.nextLine();
                if (!fighter1.name.equals(name) && !fighter2.name.equals(name)) {
                throw new Exception("Entered non-correct name of the fighter!");
                } else {
                    System.out.println(declareWinner(fighter1, fighter2, name));
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.print("Enter a name of the attacker:");

            }
        } while (true);

    }
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        if (fighter1.name.equals("") || fighter1.health <= 0 || fighter1.damagePerAttack <= 0) {
            throw new IllegalArgumentException("Non-correct object instance");
        }
        if (fighter2.name.equals("") || fighter2.health <= 0 || fighter2.damagePerAttack <= 0) {
            throw new IllegalArgumentException("Non-correct object instance");
        }
        Fighter a, b;
        if (firstAttacker.equals(fighter1.name)) {
            a = fighter1;
            b = fighter2;
        }else if (firstAttacker.equals(fighter2.name)) {
            a = fighter2;
            b = fighter1;
        } else {
            throw new IllegalArgumentException("Non-correct attacker name");
        }
        System.out.println(a.name + " attacks first");
        while (true) {
            if ((b.health -= a.damagePerAttack) <= 0) return a.name + " wins";
            if ((a.health -= b.damagePerAttack) <= 0) return b.name + " wins";
        }
    }
    static class Fighter {
        public String name;
        public int health, damagePerAttack;
        public Fighter(String name, int health, int damagePerAttack) {
            this.name = name;
            this.health = health;
            this.damagePerAttack = damagePerAttack;
        }
    }
}
