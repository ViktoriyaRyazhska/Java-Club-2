package javaClub.team3;

public class Task14 extends Task{
    @Override
    void execute() {
        try{
            int a = 0, i=0;
            System.out.println("How many fraction do you want to add?");
            a = scanner.nextInt();
            while(a <0){
                System.out.println("Something is wrong/ Enter the number again:");
                a = scanner.nextInt();
            }
            Fraction defaultFr = new Fraction(0,0);
            Fraction temp = new Fraction(0,0);
            defaultFr.EnterTheFraction(i+1);

            if (a != i+1){
                for(i = 1; i<a; i++){
                    temp.EnterTheFraction(i+1);
                    defaultFr =defaultFr.add(temp);
                }
            }
            System.out.println(defaultFr.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public class Fraction implements Comparable<Fraction>
    {
        private long top;
        private long bottom;

        public Fraction(long numerator, long denominator) {
            top = numerator;
            bottom = denominator;
        }

        @Override
        public int hashCode() { return 17 * Long.hashCode(top) + Long.hashCode(bottom); }
        @Override
        public boolean equals(Object o) { return compareTo((Fraction)o) == 0; }
        @Override
        public int compareTo(Fraction f2){ return Long.compare(top * f2.bottom, f2.top * bottom); }
        @Override
        public String toString() {
            return top + "/" + bottom;
        }

        public void EnterTheFraction(int i) {
            System.out.println("Enter the top of the "+i+". fraction:");
            this.top = scanner.nextLong();
            System.out.println("Enter the bottom of the "+i+". fraction:");
            this.bottom = scanner.nextLong();
        }

        public Fraction add(Fraction f2) {
            long newTop1 = this.top * f2.bottom;
            long newTop2 = this.bottom * f2.top;
            long newTop = newTop1+newTop2;
            long newBottom = this.bottom * f2.bottom;
            Fraction fractionRes = new Fraction(newTop, newBottom);
            return fractionRes.Reduction();
        }

        public Fraction Reduction() {
            long limit = Math.min(this.top,this.bottom);
            for (long i=2; i<= limit; i++) {
                if (this.top%i ==0 && this.bottom  % i ==0 ){
                    this.top/=i;
                    this.bottom/=i;
                }
            }
            return this;
        }
    }
}