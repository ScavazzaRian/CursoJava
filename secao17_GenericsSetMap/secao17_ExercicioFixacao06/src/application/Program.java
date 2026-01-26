package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import model.Candidatos;

public class Program {
	public static void main(String[] args) {
		Map<Candidatos, Integer> votes = new LinkedHashMap<>();
		String path = "C:\\temp\\candidatos.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String linha = br.readLine();
			while (linha != null) {
				String[] vetor = linha.split(",");
				Candidatos name = new Candidatos(vetor[0]);
				int count = Integer.parseInt(vetor[1]);

				votes.put(name, votes.getOrDefault(name, 0) + count);

				linha = br.readLine();
			}

			for (Candidatos key : votes.keySet()) {
				System.out.println(key.getName() + ": " + votes.get(key));
			}
		} catch (IOException e) {
			System.out.println("Error: " + e);
		}
	}
}
