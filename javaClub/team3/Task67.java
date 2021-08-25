package javaClub.team3;

//https://www.codewars.com/kata/alternating-case-<-equals->-alternating-case/
public class Task67 extends Task{
    @Override
    void execute() {
        System.out.println("Print string to Up/LowerCase");
        System.out.println(new StringUtils().toAlternativeString(scanner.nextLine()));
    }
}

class StringUtils {
    public String toAlternativeString(String string) {
        String res = "";

        for (char a : string.toCharArray()) {
            if (a >= 65 && a <= 90) {
                a+=32;
            } else {
                if (a >= 97 && a <= 122) {
                    a-=32;
                }
            }
            res+=a;
        }

        return res;
    }
}