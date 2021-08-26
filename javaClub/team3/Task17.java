package javaClub.team3;

//https://www.codewars.com/kata/55b75fcf67e558d3750000a3
/* @Test
* create Block object with params
* call getValue and getSurfaceArea
*
* Exceptions:
* InputMismatchException when any value <= 0
* */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task17 extends Task{
    @Override
    void execute() {
        Scanner scanner = new Scanner(System.in);
        int width, length, height;
        System.out.println("Input width");
        try {
            width = scanner.nextInt();
            if (width <= 0) throw new InputMismatchException();
        } catch (InputMismatchException e) {
            System.err.println("Incorrect input");
            return;
        }
        System.out.println("Input length");
        try {
            length = scanner.nextInt();
            if (length <= 0) throw new InputMismatchException();
        } catch (InputMismatchException e) {
            System.err.println("Incorrect input");
            return;
        }
        System.out.println("Input height");
        try {
            height = scanner.nextInt();
            if (height <= 0) throw new InputMismatchException();
        } catch (InputMismatchException e) {
            System.err.println("Incorrect input");
            return;
        }

        Block block = new Block(new int[]{width, length, height});
        long volume, surface;
        try {
            volume = block.getVolume();
            surface = block.getSurfaceArea();
        } catch (InputMismatchException e) {
            System.out.println("Numbers too high");
            return;
        }
        System.out.println("Volume: " + volume + "\nSurface area: " + surface);
    }
    public static class Block{
        private static int width;
        private static int length;
        private static int height;
        private static long volume;
        private static long surfaceArea;

        Block(int[] values) {
            checkForMismatch(values[0]);
            checkForMismatch(values[1]);
            checkForMismatch(values[2]);
            setWidth(values[0]);
            setLength(values[1]);
            setHeight(values[2]);
            calc();
        }

        private void checkForMismatch(int value) {
            if (value <= 0) throw new InputMismatchException();
        }

        public void calc() {
            int width = getWidth();
            int length = getLength();
            int height = getHeight();
            setVolume((long) width *length*height);
            setSurfaceArea(((long) width *length+ (long) length *height+ (long) height *width)*2);
        }

        public void setWidth(int width) {
            this.width = width;
        }
        public void setLength(int length) {
            this.length = length;
        }
        public void setHeight(int height) {
            this.height = height;
        }
        private void setVolume(long volume) {
            this.volume = volume;
        }
        private void setSurfaceArea(long surfaceArea) {
            this.surfaceArea = surfaceArea;
        }

        public static int getWidth() {
            return width;
        }
        public static int getLength() {
            return length;
        }
        public static int getHeight() {
            return height;
        }
        public static long getVolume() {
            return volume;
        }
        public static long getSurfaceArea() {
            return surfaceArea;
        }
    }
}

