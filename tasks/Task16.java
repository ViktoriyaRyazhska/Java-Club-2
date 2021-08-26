package java_core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task16 {
	
	public String name;
	public int health;
	public int damagePerAttack;
	
	
	public Task16(String name, int health, int damagePerAttack) {
		this.name = name;
		this.health = health;
		this.damagePerAttack = damagePerAttack;
	}
	
	
	public static String declareWinner(Task16 fighter, Task16 fighter2, String firstAttacker) {
		
		
		if (fighter.name.equalsIgnoreCase(firstAttacker)) {
	
			while(true) {
				
				fighter2.health -= fighter.damagePerAttack;
				if(fighter2.health <1) {
					return fighter.name;
				}
				fighter.health -= fighter2.damagePerAttack;
				if(fighter.health <1) {
					return fighter2.name;
				}
			}
		}else if (fighter2.name.equalsIgnoreCase(firstAttacker)) {
			declareWinner(fighter2, fighter, firstAttacker);
		}
		
		else {
			System.err.print("smth");
			
		}
		return null;
	}	
	
	public static void main(String[] args) throws IOException, NumberFormatException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the stats of the first Fighter - Name, Health and Damage per Attack");
		String name1 = br.readLine();	
		int health1 = Integer.parseInt(br.readLine());
		int damagePerAttack1 = Integer.parseInt(br.readLine());
		
		Task16 f1 = new Task16 (name1, health1, damagePerAttack1);
		
		System.out.println("Enter the stats of the second Fighter - Name, Health and Damage per Attack");
		String name2 = br.readLine();
		int health2 = Integer.parseInt(br.readLine());
		int damagePerAttack2 = Integer.parseInt(br.readLine());
		
		Task16 f2 = new Task16(name2, health2, damagePerAttack2);
			
		System.out.println("There two fighters - 1 " + name1 + " and 2 " + name2+ " ,type who will be the first to attack");
		String firstA = br.readLine();
		
		if(!firstA.equalsIgnoreCase(name1) && !firstA.equalsIgnoreCase(name2)) {
			System.err.print("You must enter one of two names");
		}else {
			System.out.println("The winner is " + declareWinner(f1, f2, firstA));
		}
		
		
	}
	

}
