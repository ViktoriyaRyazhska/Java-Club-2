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
        taskMap.put(15, new Task15());
        taskMap.put(18, new Task18());
        taskMap.put(20, new Task20());
        taskMap.put(23, new Task23());
        taskMap.put(25, new Task25());
        taskMap.put(28, new Task28());
        taskMap.put(33, new Task33());
        taskMap.put(35, new Task35());
        taskMap.put(40, new Task40());
        taskMap.put(45, new Task45());
        taskMap.put(50, new Task50());
        taskMap.put(55, new Task55());
        taskMap.put(60, new Task60());
        taskMap.put(65, new Task65());
        taskMap.put(70, new Task70());

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
