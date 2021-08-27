package java_core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task16 {
	
	public String name;
	public int health, damagePerAttack;
	
	
	
	public static String decalreWinner (Task16 fighter1, Task16 fighter2 , String firstAttacker) {
		
	if( fighter1.name.equals(firstAttacker)) {
		
		while(true) {
			fighter2.health -= fighter1.damagePerAttack;
			if(fighter2.health <= 0) 
				return fighter1.name;
			
			fighter1.health -= fighter2.damagePerAttack;
			if(fighter1.health <= 0) 
				return fighter2.name;
		}
		
	}
	else {
		
		//return decalreWinner(fighter2, fighter1, firstAttacker);
		return "a";
	}
	}
	
	
	public Task16(String name, int health, int damagePerAttack) {
		this.name = name;
		this.health = health;
		this.damagePerAttack = damagePerAttack;
	}
	
	
	public static void main(String[] args) {
		
		try {
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
			
		Task16 fighter1 = new Task16("Jim", 140, 5);
		Task16 fighter2 = new Task16("Jack", 150,10);
		System.out.println("Enter the Name of first attcker");
		String firstAttacker = br.readLine();
//		
//		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
//		
//		System.out.println("Enter the stats for first Fighter - name, health and damage per attack");
//		fighter1.name = br.readLine();
//		fighter1.health = Integer.parseInt(br.readLine());
//		fighter1.damagePerAttack = Integer.parseInt(br.readLine());
//		
//		System.out.println("Enter the stats for first Fighter - name, health and damage per attack");
//		fighter2.name = br.readLine();
//		fighter2.health = Integer.parseInt(br.readLine());
//		fighter2.damagePerAttack = Integer.parseInt(br.readLine());
		
		System.out.println(decalreWinner(fighter1, fighter2, firstAttacker));
		
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}
