package javaClub.team3;

//https://www.codewars.com/kata/55b75fcf67e558d3750000a3

import java.util.Scanner;

public class Task17 extends Task{
    @Override
    void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print width, length, height values");
        int []values = new int[3];
        values[0] = scanner.nextInt();
        values[1] = scanner.nextInt();
        values[2] = scanner.nextInt();
        Block block = new Block(values);
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