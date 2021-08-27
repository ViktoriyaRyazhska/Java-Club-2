/*
 * https://www.codewars.com/kata/counting-sheep-dot-dot-dot
 */

package com.javaclub.team4.loops;

import com.javaclub.team4.Task;

/*
Consider an array/list of sheep where some sheep may be missing from their place.
We need a function that counts the number of sheep present in the array (true means present).

For example,

[true,  true,  true,  false,
  true,  true,  true,  true ,
  true,  false, true,  false,
  true,  false, false, true,
  true,  true,  true,  true,
  false, false, true,  true]
The correct answer would be 17.

Hint: Don't forget to check for bad values like null/undefined
*/

public class Task36 extends Task {

	@Override
	public void runTask() {

		boolean[] arrayOfSheeps = new boolean[24];
		for (int i = 0; i < arrayOfSheeps.length; i++) {
			if ((int) (Math.random() * 2) == 1) {
				arrayOfSheeps[i] = true;
			}
		}
		for (boolean b : arrayOfSheeps) {
			System.out.println(b);
		}

//		System.out.println("Please enter current color of the traffic light to know which one should light up next:");
//		while (true) {
//			try {
//				br.readLine();
//			} catch (IOException e) {
//				System.err.println("Invalid input :( Try again.");
//			}
//		}
	}

	public int countSheeps(Boolean[] arrayOfSheeps) {

		return 0;
	}
}
