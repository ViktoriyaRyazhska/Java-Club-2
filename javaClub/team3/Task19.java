package javaClub.team3;

public class Task19 extends Task {
    @Override
    void execute() {
        try{
            System.out.println("Enter the first number: ");
            long n = scanner.nextLong();
            System.out.println("Enter the second number: ");
            long a = scanner.nextLong();
            System.out.println("Enter the third number: ");
            long b = scanner.nextLong();

            DivisibleNb div = new DivisibleNb();
            System.out.println(div.isDivisible(n,a,b));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class DivisibleNb {
    public boolean isDivisible(long n, long x, long y) {
        if(n%x == 0 && n%y == 0){
            return true;
        }
        else{
            return false;
        }
    }
}