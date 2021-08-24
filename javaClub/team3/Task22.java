package javaClub.team3;
//https://www.codewars.com/kata/how-old-will-i-be-in-2099/

public class Task22 extends Task{
    @Override
    void execute() {
        System.out.println("Print your birth year and year you want to know how old you will/were");
        AgeDiff ageDiff = new AgeDiff();
        System.out.println(ageDiff.CalculateAge(scanner.nextInt(), scanner.nextInt()));
    }
}

class AgeDiff {
    public static String CalculateAge(int birth, int yearTo) {
        if (birth < yearTo) {
            if (yearTo-birth == 1) return ("You are " + (yearTo-birth) + " year old.");
            return ("You are " + (yearTo-birth) + " years old.");
        } else {
            if (birth > yearTo) {
                if (birth-yearTo == 1) return ("You will be born in " + (birth-yearTo) + " year.");
                return ("You will be born in " + (birth-yearTo) + " years.");
            } else {
                return ("You were born this very year!");
            }
        }
    }
}