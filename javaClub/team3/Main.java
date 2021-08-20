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
        taskMap.put(5, new Task5());
        taskMap.put(7, new Task7());
        taskMap.put(10, new Task10());
        taskMap.put(11, new Task11());

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
