package javaClub.team3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int taskNumber = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Task> taskMap = new LinkedHashMap<>();
//        taskMap.put(1, new Task(1));
        taskMap.put(2, new Task2());

        taskMap.put(3, new Task3());
        taskMap.put(4, new Task(4));
        taskMap.put(5, new Task5());
//        taskMap.put(6, new Task(6));
        taskMap.put(7, new Task7());
        taskMap.put(8, new Task8());
        taskMap.put(9, new Task(9));
        taskMap.put(10, new Task10());

        taskMap.put(11, new Task11());
//        taskMap.put(12, new Task(12));
//        taskMap.put(13, new Task(13));
        taskMap.put(14, new Task14());
        taskMap.put(15, new Task15());
//        taskMap.put(16, new Task(16));
//        taskMap.put(17, new Task(17));
        taskMap.put(18, new Task18());
        taskMap.put(19, new Task19());
        taskMap.put(20, new Task20());

//        taskMap.put(21, new Task(21));
//        taskMap.put(22, new Task(22));
        taskMap.put(23, new Task23());
        taskMap.put(24, new Task24());
        taskMap.put(25, new Task25());
//        taskMap.put(26, new Task(26));
//        taskMap.put(27, new Task(27));
        taskMap.put(28, new Task28());
        taskMap.put(29, new Task29());
//        taskMap.put(30, new Task(30));

//        taskMap.put(31, new Task(31));
//        taskMap.put(32, new Task(32));
        taskMap.put(33, new Task33());
//        taskMap.put(34, new Task(34));
//        taskMap.put(35, new Task(35));
//        taskMap.put(36, new Task(36));
//        taskMap.put(37, new Task(37));
//        taskMap.put(38, new Task(38));
//        taskMap.put(39, new Task(39));
//        taskMap.put(40, new Task(40));

//        taskMap.put(41, new Task(41));
//        taskMap.put(42, new Task(42));
//        taskMap.put(43, new Task(43));
//        taskMap.put(44, new Task(44));
//        taskMap.put(45, new Task(45));
//        taskMap.put(46, new Task(46));
//        taskMap.put(47, new Task(47));
//        taskMap.put(48, new Task(48));
//        taskMap.put(49, new Task(49));
//        taskMap.put(50, new Task(50));

//        taskMap.put(51, new Task(51));
//        taskMap.put(52, new Task(52));
//        taskMap.put(53, new Task(53));
//        taskMap.put(54, new Task(54));
//        taskMap.put(55, new Task(55));
//        taskMap.put(56, new Task(56));
//        taskMap.put(57, new Task(57));
//        taskMap.put(58, new Task(58));
//        taskMap.put(59, new Task(59));
//        taskMap.put(60, new Task(60));

//        taskMap.put(61, new Task(61));
//        taskMap.put(62, new Task(62));
//        taskMap.put(63, new Task(63));
//        taskMap.put(64, new Task(64));
//        taskMap.put(65, new Task(65));
//        taskMap.put(66, new Task(66));
//        taskMap.put(67, new Task(67));
//        taskMap.put(68, new Task(68));
//        taskMap.put(69, new Task(69));
//        taskMap.put(70, new Task(70));

//        taskMap.put(71, new Task(71));
//        taskMap.put(72, new Task(72));

        while (true) {
            System.out.println("Please enter task number, 0 for exit: ");
            try {
                taskNumber = Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {
                System.err.println("Not a number!");
                continue;
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (taskNumber == 0) return;
            if (!taskMap.containsKey(taskNumber)) {
                System.err.println("There is no such task!");
            } else {
                Task task = taskMap.get(taskNumber);
                task.execute();
            }
        }
    }
}
