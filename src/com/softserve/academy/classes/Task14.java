package com.softserve.academy.classes;

import static java.math.BigInteger.valueOf;

public class Task14 implements Comparable<Task14> {

    private final long top;
    private final long bottom;

    public Task14(long numerator, long denominator) {
        long x = valueOf(numerator).gcd(valueOf(denominator)).longValue();
        top = numerator / x;
        bottom = denominator / x;

    }

    @Override
    public int hashCode() { return 17 * Long.hashCode(top) + Long.hashCode(bottom); }
    @Override
    public boolean equals(Object o) { return compareTo((Task14)o) == 0; }
    @Override
    public int compareTo(Task14 f2){ return Long.compare(top * f2.bottom, f2.top * bottom); }
    @Override
    public String toString() {
        return top + "/" + bottom;
    }




    public Task14 add(Task14 f2) {
        return new Task14(top * f2.bottom + f2.top * bottom, bottom * f2.bottom);
    }
}
