package java_core;

import java.util.Scanner;

public class Task13 {

    private static final int ONE_HUNDRED = 100;

    private int value;

    private Task13() {
        value = ONE_HUNDRED;
    }

    public int plus100(int n) {
        return value + n;
    }

    public static int AddHundred(){
        Scanner scanner = new Scanner(System.in);
        final Task13 INST = new Task13();
        System.out.println("Enter your integer number:");
        int i;
        do {
            try {
                String s = scanner.nextLine();
                i = Integer.parseInt(s);
                break;
            }
            catch (Exception wrongInputDataType) {
                System.out.println("Wrong input data type...");
            }
        } while (true);
        return INST.plus100(i);
    }

    public static void main(String[] args) {
        System.out.println(AddHundred());
    }
}
