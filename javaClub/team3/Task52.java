package javaClub.team3;
//
public class Task52 extends Task{
    @Override
    void execute() {
        System.out.println("Print string to reverse");
        System.out.println(new Kata().solution(scanner.nextLine()));
    }
}

class Kata {

    public String solution(String str) {
        return new StringBuilder().append(str).reverse().toString();
    }

}