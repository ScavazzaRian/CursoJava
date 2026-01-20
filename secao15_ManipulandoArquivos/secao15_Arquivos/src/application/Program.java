package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	/*
	 * Class File:
	 *     - Representacao abstrata de um arquivo e seu caminho
	 *     
	 * Class Scanner:
	 * 	   - Leitor de Texto
	 * 
	 * IOException:
	 * 	   - Excecao para In/Out
	 */
	public static void main(String[] args) {
		File file = new File("C:\\temp\\in.txt");
		Scanner scanner = null;
		
		try {
			scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
		} catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if(scanner != null) {
				scanner.close();
			}
		}
	}
}
