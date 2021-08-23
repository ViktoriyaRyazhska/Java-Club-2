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
        taskMap.put(2, new Task2());
        taskMap.put(3, new Task3());
        taskMap.put(5, new Task5());
        taskMap.put(7, new Task7());
        taskMap.put(8, new Task8());
        taskMap.put(10, new Task10());
        taskMap.put(11, new Task11());
        taskMap.put(14, new Task14());
        taskMap.put(15, new Task15());
        taskMap.put(18, new Task18());
        taskMap.put(19, new Task19());
        taskMap.put(20, new Task20());
        taskMap.put(23, new Task23());
        taskMap.put(24, new Task24());
        taskMap.put(25, new Task25());
        taskMap.put(28, new Task28());
        taskMap.put(29, new Task29());
        taskMap.put(33, new Task33());

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
