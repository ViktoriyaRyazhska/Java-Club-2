/*
 * https://www.codewars.com/kata/simple-drawing-board
 */
package com.javaclub.team4.classes;

import com.javaclub.team4.Task;

//import com.javaclub.team4.Task;

/*
	You are going to write a simple console-style drawing board program.
	
	Functions
	The drawing board is very simple so only these functions are supported.
	
	Function	Description
	Create canvas	Create new empty canvas (filled with ' ') with given width and height
	Draw line / rectangle	Draw the line with 'x' which connects the given points.
	If the points are diagonal, a rectangle instead of diagonal line should be drawn
	Fill color	Fill the entire area connected to the given point with given character, also known as "bucket fill" in paint programs
	Output
	Implement the drawCanvas method to return the string contains the entire canvas surrounded by borders with - and |.
	
	Example
	Empty canvas 4x2
	
	------
	|    |
	|    |
	------
	Drawing 2 lines (0, 2) to (4, 2) and (2, 0) to (2, 4)
	
	-------
	|  x  |
	|  x  |
	|xxxxx|
	|  x  |
	|  x  |
	-------
	Drawing a rectangle (1, 1) to (5, 4) and fill with o
	
	---------
	|       |
	| xxxxx |
	| xooox |
	| xooox |
	| xxxxx |
	|       |
	---------
	Error handling
	For any invalid input, raise an error/exception depends on the language.
	
	In Java should throw java.lang.IllegalArgumentException
	In JavaScript should throw the string Out of bounds
	The data type of the arguments is always valid, no need to do type checks.
	
	Remarks
	The drawing board functions should return the object itself to allow method chaining
	The coordinates are zero-based, therefore the origin is (0, 0), which is at the top-left corner
	The coordinates are inclusive in draw method
	If the area is already filled with different color, fill method should do nothing
*/

public class Task15 extends Task {

//	private int height;
//	private int width;
	private char[][] canvas;

	public Task15(int height, int width) {
		canvas = new char[height + 2][width + 2];
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				canvas[i][j] = ' ';
			}
		}
	}

	public Task15 draw(int x1, int y1, int x2, int y2) {
		return this;
	}

	public Task15 fill(int x, int y, char ch) {
		return this;
	}

	public String drawCanvas() {
		return "draw the canvas with borders";
	}

	@Override
	public void runTask() {
		
	}

	public static void main(String[] args) {

		Task15 canvas1 = new Task15(5, 5);
		for (int i = 0; i < canvas1.canvas.length; i++) {
			for (int j = 0; j < canvas1.canvas[0].length; j++) {
				System.out.print(canvas1.canvas[i][j]);
			}
			System.out.println();
		}
	}
}
