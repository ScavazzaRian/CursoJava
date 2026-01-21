package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		List<Funcionario> list = new ArrayList<>();
		String path = "C:\\temp\\funcionario.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String name = br.readLine();
			while (name != null) {
				String[] vetor = name.split(",");
				list.add(new Funcionario(vetor[0], Double.parseDouble(vetor[1])));
				name = br.readLine();
			}

//			list.sort(Comparator.comparing(Funcionario::getName).thenComparing(Funcionario::getSalary));
			Collections.sort(list);
			for (Funcionario s : list) {
				System.out.println(s.getName() + ", " + s.getSalary());
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
