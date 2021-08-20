package java_core;

import java.util.Scanner;

public class Тask7 {
    public static void main(String[] args) {

        int h,m,s;
        Scanner scanner = new Scanner(System.in);

        System.out.print("h = ");
        h = scanner.nextInt();

        System.out.print("m = ");
        m = scanner.nextInt();

        System.out.print("s = ");
        s = scanner.nextInt();

        System.out.println(getTime(h,m,s));

    }

    public static int getTime (int h,int m, int s){
        h = h*3600;
        m = m*60;
        return (h+m+s)*1000;
    }
}
