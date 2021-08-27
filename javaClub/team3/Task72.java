package javaClub.team3;
//https://www.codewars.com/kata/57a93f93bb9944516d0000c1

/* @Test
 * create Dictionary object
 * call newEntry to add data
 * call look to test
 *
 * Sample:
 * if data exist returns value = * (explanation)
 * if data doesn't exist = Can`t find entry for * (key)
 *
 * Exceptions:
 * InputMismatchException if any value empty (length==0)
 */
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Task72 extends Task{
    @Override
    void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print key-word");
        String key;
        try {
            key = scanner.nextLine();
            if (key.length() == 0) throw new InputMismatchException();
        } catch (InputMismatchException e) {
            System.err.println("Incorrect input");
            return;
        }
        System.out.println("Now print explanation to word");
        String value;
        try {
            value = scanner.nextLine();
            if (value.length() == 0) throw new InputMismatchException();
        } catch (InputMismatchException e) {
            System.err.println("Incorrect input");
            return;
        }
        Dictionary dictionary = new Dictionary();
        dictionary.newEntry(key, value);
        System.out.println(key + " - " + dictionary.look(key));
//        System.out.println(key + " - " + dictionary.look("NotExistKey"));
    }

    public static class Dictionary {
        private Map<String, String> entries = new HashMap<>();

        public Dictionary(){
        }

        public void newEntry(String key, String value){
            this.entries.put(key, value);
        }

        public String look(String key){
            String value = getEntries().get(key);
            if (value == null) return "Can`t find entry for "+key;
            return value;
        }

        public void setEntries(Map<String, String> entries) {
            this.entries = entries;
        }

        public Map<String, String> getEntries() {
            return entries;
        }
    }
}

