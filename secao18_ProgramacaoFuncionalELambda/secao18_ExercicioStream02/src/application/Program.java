package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import model.Funcionario;

public class Program {
	public static void main(String[] args) {
		List<Funcionario> listaFuncionario = new ArrayList<>();
		String path = "C:\\temp\\candidatos.csv";
		Double value = 2000.00;
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String linha = br.readLine();
			while (linha != null) {
				String[] data = linha.split(",");
				listaFuncionario.add(new Funcionario(data[0], data[1], Double.parseDouble(data[2])));
				linha = br.readLine();
			}
			
			double soma = listaFuncionario.stream().filter(x -> x.getName().charAt(0) == 'M').map(x -> x.getSalary()).reduce(0.0, (x, y) -> x + y);
			
			Comparator<String> comp = (s1, s2) -> s1.toLowerCase().compareTo(s2.toLowerCase());
			
			List<String> listaOrdenada = listaFuncionario.stream()
					.filter(x -> x.getSalary() >= value)
					.map(x -> x.getEmail())
					.sorted(comp)
					.collect(Collectors.toList());
			
			listaOrdenada.forEach(System.out::println);
			System.out.println(soma);
		} catch (IOException e) {
			System.out.println("Error: " + e);
		}
	}
}
