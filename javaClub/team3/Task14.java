package javaClub.team3;

import java.util.Scanner;

public class Task14 extends Task{
    @Override
    void execute() {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter the top of the first fraction:");
            int top = scanner.nextInt();
            System.out.println("Enter the bottom of the first fraction:");
            int bottom = scanner.nextInt();
            Fraction firstOne = new Fraction(top, bottom);

            System.out.println("Enter the top of the second fraction:");
            top = scanner.nextInt();
            System.out.println("Enter the bottom of the second fraction:");
            bottom = scanner.nextInt();
            Fraction secondOne = new Fraction(top, bottom);

            System.out.println(firstOne.add(secondOne).toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static class Fraction
    {
        private final long top;
        private final long bottom;

        public Fraction(long numerator, long denominator) {
            top = numerator;
            bottom = denominator;
        }

        @Override
        public String toString() {
            return top + "/" + bottom;
        }

        public Fraction add(Fraction f2) {
            long top= this.top * f2.bottom + this.bottom * f2.top;
            long bottom= this.bottom * f2.bottom;
            Fraction newOne = new Fraction(top, bottom);
            return newOne.Reduction();
        }

        public Fraction Reduction() {
            long gcd =0;
            for (long i=1; i<= this.bottom && i<= this.top; i++) {
                if (this.top%i ==0 && this.bottom  % i ==0 ){
                    gcd = i;
                }
            }
            Fraction newOne = new Fraction(this.top/gcd, this.bottom/gcd);
            return newOne;
        }
    }
}
