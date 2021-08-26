package javaClub.team3;
//https://www.codewars.com/kata/two-fighters-one-winner/
public class Task16 extends Task{
    @Override
    void execute() {

    }
    public static class Kata {
        public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
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

        public class Fighter {
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
