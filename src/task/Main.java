package task;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String fileName;
		String enteredText;
				
		System.out.println("Please enter text: ");
		enteredText = sc.nextLine();
		
		System.out.println("Please enter file name: ");
		fileName = sc.nextLine();
		
		sc.close();
		
		File file1 = new File(fileName + ".txt");
				
		saveStringToFile(file1, enteredText);
				
	}
	
	public static void saveStringToFile(File file, String enteredText) {
		try (PrintWriter pw = new PrintWriter(file)) {
			pw.println(enteredText);			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
