package javaClub.team3;

import java.util.Scanner;

//https://www.codewars.com/kata/remove-string-spaces/
public class Task57 extends Task{
    @Override
    void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print string to remove spaces");
        System.out.println(new Kata57().noSpace(scanner.nextLine()));
    }
}

class Kata57 {
    public String noSpace(final String x) {
        return x.replaceAll(" ", "");
    }
}