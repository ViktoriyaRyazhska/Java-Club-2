package java_core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws Exception, IOException {
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter the number of task");
		int taskNum = Integer.parseInt(br.readLine());
		
		// Ã‘â€šÃ‘Æ’Ã‘â€š Ã�Â²Ã‘ï¿½Ã‘â€šÃ�Â°Ã�Â²Ã�Â»Ã‘ï¿½Ã‘â€�Ã�Â¼Ã�Â¾ main Ã�Â½Ã�Â°Ã‘Ë†Ã�Â¸Ã‘â€¦ Ã�Â·Ã�Â°Ã�Â´Ã�Â°Ã‘â€¡ Ã‘â€“ Ã�Â±Ã‘Æ’Ã�Â´Ã�ÂµÃ�Â¼Ã�Â¾ Ã�Â²Ã�Â¸Ã�ÂºÃ�Â»Ã�Â¸Ã�ÂºÃ�Â°Ã‘â€šÃ�Â¸ Ã�Â·Ã�Â° Ã�Â´Ã�Â¾Ã�Â¿Ã�Â¾Ã�Â¼Ã�Â¾Ã�Â³Ã�Â¾Ã‘Å½ switch-case
		// Ã�Â´Ã�Â¾Ã�Â±Ã�Â°Ã�Â²Ã�Â»Ã‘ï¿½Ã‘â€�Ã�Â¼Ã�Â¾ Ã�Â½Ã�Â¾Ã�Â²Ã‘â€“ case Ã�Â¿Ã�Â¾ Ã�Â½Ã‘Æ’Ã�Â¼Ã�ÂµÃ‘â‚¬Ã�Â°Ã‘â€ Ã‘â€“Ã‘â€” 1,2,3, ....
		
		while (true) {
			
			switch (taskNum) {
			
			case 1:
				
				Task.main(args);
				
			case 2:
				
				Task2.main(args);
							
			case 3:
				
				Task3.main(args);
				
			case 4:
				
				Task4.main(args);
				
			case 8:
				
				Task8.main(args);
				
			}
			
		}
		
}
}

