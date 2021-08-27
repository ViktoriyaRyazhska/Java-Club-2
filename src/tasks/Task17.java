package tasks;

import java.util.Scanner;

/*
https://www.codewars.com/kata/building-blocks/
Write a class Block that creates a block (Duh..)
##Requirements
The constructor should take an array as an argument, this will contain 3 integers of the form [width, length, height] from which the Block should be created.
Define these methods:
`getWidth()` return the width of the `Block`
`getLength()` return the length of the `Block`
`getHeight()` return the height of the `Block`
`getVolume()` return the volume of the `Block`
`getSurfaceArea()` return the surface area of the `Block`
##Examples
    Block b = new Block(new int[]{2,4,6}) -> creates a `Block` object with a width of `2` a length of `4` and a height of `6`
    b.getWidth() // -> 2
    b.getLength() // -> 4
    b.getHeight() // -> 6
    b.getVolume() // -> 48
    b.getSurfaceArea() // -> 88
 */

public class Task17{

    public static void main(String[] args) {

        System.out.println("Print width, length, height values");
        int[] values = new int[3];
        Scanner scanner = new Scanner(System.in);
        try {
            values[0] = scanner.nextInt();
            values[1] = scanner.nextInt();
            values[2] = scanner.nextInt();
        }
        catch (Exception wrongInputDataType){
            System.out.println("Wront input data type...");
            Task17.main(args);
        }


        Block block = new Block(values);


            if (values[0] <= 0) {
                System.out.println("Enter positive width!");

            }
            if (values[1] <= 0) {
                System.out.println("Enter positive length!");

            }
            if (values[2] <= 0) {
                System.out.println("Enter positive height!");
                System.exit(0);

            }

            System.out.println("Volume: " + block.getVolume() + "\nSurface area: " + block.getSurfaceArea());

    }
}

class Block{
    private int width;
    private int length;
    private int height;
    private int volume;
    private int surfaceArea;

    Block(int[] values) {
        setWidth(values[0]);
        setLength(values[1]);
        setHeight(values[2]);
        calc();
    }

    public void calc() {
        int width = getWidth();
        int length = getLength();
        int height = getHeight();
        setVolume(width*length*height);
        setSurfaceArea((width*length+length*height+height*width)*2);
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public void setSurfaceArea(int surfaceArea) {
        this.surfaceArea = surfaceArea;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public int getLength() {
        return length;
    }
    public int getSurfaceArea() {
        return surfaceArea;
    }
    public int getVolume() {
        return volume;
    }
    public int getWidth() {
        return width;
    }
}
