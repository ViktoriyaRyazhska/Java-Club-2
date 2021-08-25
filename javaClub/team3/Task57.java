package javaClub.team3;
//https://www.codewars.com/kata/remove-string-spaces/
public class Task57 extends Task{
    @Override
    void execute() {
        System.out.println("Print string to remove spaces");
        System.out.println(new Kata().noSpace(scanner.nextLine()));
    }
}

class Kata {
    public String noSpace(final String x) {
        return x.replaceAll(" ", "");
    }
}