package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
	/*
	 * Do mesmo jeito que temos o FileReader e o BufferedReader temos sua versao pra escrita;
	 * 
	 * FileWriter Class:
	 * 		- new FileWriter(path) -> cria/recria o arquivo;
	 * 		- new FileWriter(path, true) -> acrescenta ao arquivo existente;
	 * 
	 * BufferedWrite Class:
	 * 		- Versao mais rapida;
	 */
	public static void main(String[] args) {
		String[] lines = new String[] {"Good Morning", "Good Afternoon", "Good Night"};
		
		String path = "C:\\temp\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
