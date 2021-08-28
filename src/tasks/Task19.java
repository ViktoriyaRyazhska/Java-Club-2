package tasks;
import java.util.Scanner;

public class Task19 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n, x, y;
        n = scanner.nextInt();
        x = scanner.nextInt();
        y = scanner.nextInt();
        System.out.println(isDivisible(n, x, y));

    }


    public static boolean isDivisible(long n, long x, long y) {
        if (n % x == 0 && n % y == 0) return true;
        else return false;
    }
}
