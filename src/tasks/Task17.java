package tasks;

import java.util.Scanner;

/*
https://www.codewars.com/kata/building-blocks/
You are provided with a skeleton of the class 'Fraction', which accepts two arguments (numerator, denominator).
EXAMPLE:
Fraction fraction1 = new Fraction(4, 5);
Your task is to make this class string representable, and addable while keeping the result in the minimum representation possible.
EXAMPLE:
System.out.println(fraction1.add(new Fraction(1, 8)));
// Outputs: 37/40
NB: DON'T use the built_in class 'fractions.Fraction'
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
