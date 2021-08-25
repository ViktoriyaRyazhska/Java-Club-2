package javaClub.team3;

import java.io.IOException;
import java.util.Arrays;

/*      https://www.codewars.com/kata/gap-in-primes/
        The prime numbers are not regularly spaced. For example from 2 to 3 the gap is 1.
        From 3 to 5 the gap is 2. From 7 to 11 it is 4. Between 2 and 50 we have
        the following pairs of 2-gaps primes: 3-5, 5-7, 11-13, 17-19, 29-31, 41-43

        A prime gap of length n is a run of n-1 consecutive composite numbers between
        two successive primes (see: http://mathworld.wolfram.com/PrimeGaps.html).

        We will write a function gap with parameters:

        g (integer >= 2) which indicates the gap we are looking for

        m (integer > 2) which gives the start of the search (m inclusive)

        n (integer >= m) which gives the end of the search (n inclusive)

        n won't go beyond 1100000.

        In the example above gap(2, 3, 50) will return [3, 5] or (3, 5) or {3, 5}
        which is the first pair between 3 and 50 with a 2-gap.

        So this function should return the first pair of two prime
        numbers spaced with a gap of g between the limits m, n if these
        numbers exist otherwise `nil or null or None or Nothing
        (or ... depending on the language).*/

public class Task45 extends Task{

    @Override
    void execute() {
        long start;
        long end;
        int gap;

        try {
            System.out.println("Please enter the gap we are looking for (should be positive, less than 1100000): ");
            gap = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Please enter the start of the search (should be >2): ");
            start = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Please enter the end of the search (should be >= start of the search): ");
            end = Integer.parseInt(bufferedReader.readLine());
            if (start < 2 || end < start || gap < 0 || gap > 1100000){
                System.err.println("Wrong input!");
                return;
            }
            else {
                System.out.println(Arrays.toString(gap(gap, start, end)));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e){
            System.err.println("Not a number!");
        }
    }

    public static long[] gap(int g, long m, long n) {
        long firstPrime = 0;
        long secondPrime = 0;
        long[] result = new long[2];

        int counter=0;
        for (long i = m; i <= n; i++){
            if (isPrime(i) && counter==0){
                firstPrime = i;
                counter++;
            } else if (isPrime(i) && counter==1){
                secondPrime = i;
                counter++;
                if (counter == 2 && secondPrime-firstPrime == g){
                    result[0] = firstPrime;
                    result[1] = secondPrime;
                    return result;
                } else{
                    counter--;
                    firstPrime = secondPrime;
                }
            }
        }
        return null;
    }

    public static boolean isPrime(long x){
        for (long i = 2; i <= x/2; i++){
            if (x % i == 0){
                return false;
            }
        }
        return true;
    }
}
