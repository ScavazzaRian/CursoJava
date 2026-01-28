package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Program {

	public static void main(String[] args) {
		Map<String, List<String>> map = new LinkedHashMap<>();
		String path = "C:\\temp\\votes.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String linha = br.readLine();
			while (linha != null) {
				String[] data = linha.split(",");
				String candidato = data[0];
				String eleitor = data[1];
				
				// Tento pegar a lista de candidato caso exista
				List<String> votos = map.get(candidato);
				
				
				// Se ela for nula eu crio
				if (votos == null) {
					votos = new ArrayList<>();
					map.put(candidato, votos);
				}
				
				// map.computeIfAbsent(candidato, k -> new ArrayList<>()).add(eleitor);
				
				votos.add(eleitor);
				
				linha = br.readLine();
			}
			for (String vote : map.keySet()) {
				System.out.println("Candidate: " + vote + ", votes: " + map.get(vote));
			}
		} catch (IOException e) {
			System.out.println("Error: " + e);
		}
	}

}
