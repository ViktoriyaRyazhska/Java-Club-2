/*
* Implement a function which multiplies two numbers.
*
* https://www.codewars.com/kata/function-3-multiplying-two-numbers/
* */

package javaClub.team3;

public class Task2 extends Task{
    @Override
    void execute() {
        System.out.println("Input 2 numbers");
        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("Multiply: " + multiply(a, b));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int multiply(int num1, int num2) {
        return num1*num2;
    }
}
