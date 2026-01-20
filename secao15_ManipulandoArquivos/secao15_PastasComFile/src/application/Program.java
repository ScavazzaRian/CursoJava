package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = scanner.nextLine();
		
		File path = new File(strPath);
		
		// Da pra fazer com isFile, isFolder
		File[] folders = path.listFiles(File::isFile);
		System.out.println("FOLDERS: ");
		
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println(success);
		
		scanner.close();
	}

}
