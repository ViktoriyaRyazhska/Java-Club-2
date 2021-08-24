package com.javaclub.team4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import com.javaclub.team4.basicprogram.*;
import com.javaclub.team4.classes.*;
import com.javaclub.team4.conditions.*;
import com.javaclub.team4.loops.*;
import com.javaclub.team4.oop.*;
import com.javaclub.team4.string.*;
import com.javaclub.team4.collections.*;

public class Main {

	public static void main(String[] args) {

		int taskNumber = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer, Task> tasks = new LinkedHashMap<>();
		
		tasks.put(3, new Task3());
		tasks.put(6, new Task6());
		tasks.put(9, new Task9());
		tasks.put(18, new Task18());
		tasks.put(21, new Task21());
		tasks.put(24, new Task24());
		
		while (true) {
			System.out.println("Please enter a task number, or 0 to end the program:");
			try {
				taskNumber = Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				System.err.println("Not a number!");
				continue;
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (taskNumber == 0)
				return;
			if (!tasks.containsKey(taskNumber)) {
				System.err.println("There is no such task!");
			} else {
				Task task = tasks.get(taskNumber);
				task.runTask();
			}
		}
	}
}
