package javaClub.team3;
// https://www.codewars.com/kata/alternating-case-<-equals->-alternating-case/
// copy/paste url

/* @Test
 * call StringUtils.toAlternativeString
 *
 * Exceptions:
 * no exceptions
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task67 extends Task{
    @Override
    void execute() {
        Scanner scanner = new Scanner(System.in);
        String str;
        System.out.println("Print string to Up/LowerCase (sAMplE)");
        try {
            str = scanner.nextLine();
        } catch (InputMismatchException e) {
            System.err.println("Incorrect input");
            return;
        }
        System.out.println(StringUtils.toAlternativeString(str));
    }

    public static class StringUtils {
        public static String toAlternativeString(String string) {
            StringBuilder res = new StringBuilder();

            for (char a : string.toCharArray()) {
                if (a >= 65 && a <= 90) {
                    a+=32;
                } else {
                    if (a >= 97 && a <= 122) {
                        a-=32;
                    }
                }
                res.append(a);
            }

            return res.toString();
        }
    }
}

