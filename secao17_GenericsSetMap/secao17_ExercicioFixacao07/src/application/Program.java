package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedHashMap;
import java.util.Map;

import model.Log;

public class Program {

	public static void main(String[] args) {
		Map<Log, Integer> log = new LinkedHashMap<>();
		String path = "C:\\temp\\log.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String linha = br.readLine();
			while (linha != null) {
				Log login = new Log(linha);
				
				log.put(login, log.getOrDefault(login, 0) + 1);
				
				linha = br.readLine();
			}
			
			for (Log l : log.keySet()) {
				System.out.println(l.getName() + ", " + log.get(l));
			}
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

}
