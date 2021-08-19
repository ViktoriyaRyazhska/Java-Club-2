package java_core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws Exception, IOException {
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter the number of task");
		int taskNum = Integer.parseInt(br.readLine());
		
		// тут вставляємо main наших задач і будемо викликати за допомогою switch-case
		// добавляємо нові case по нумерації 1,2,3, ....
		
		while (true) {
			
			switch (taskNum) {
			
			case 1:
				
				Task.main(args);
				
			case 2:
				
				Task2.main(args);
				
			case 3
			
				Task3.main(args);
			
			case 4
			
				Task4.main(args);
			
			case 6
				Task6.main(args);
			
			
			}
			
		}
		
}
}

