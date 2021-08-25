package javaClub.team3;

//https://www.codewars.com/kata/will-there-be-enough-space/

public class Task27 extends Task{
    @Override
    void execute() {
        Bob bob = new Bob();
        System.out.println("Print cap, on and wait passengers values");
        int cap = scanner.nextInt();
        int on = scanner.nextInt();
        int wait = scanner.nextInt();
        System.out.println(bob.enough(cap, on, wait));
    }
}

class Bob {
    public static int enough(int cap, int on, int wait){
        return (((on+wait)-cap >= 0) ? (on+wait)-cap : 0);
    }
}
