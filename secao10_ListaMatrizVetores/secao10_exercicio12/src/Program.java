import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Util.Funcionario;

public class Program {
	public static void main(String[] args) {
		List<Funcionario> list = new ArrayList<>();
		Funcionario funcionario;
		Scanner scanner = new Scanner(System.in);
		int qtd, id;
		double salario, aumento;
		String nome;
		
		System.out.print("Quantos funcionarios serao cadastrados: ");
		qtd = scanner.nextInt();
		
		for(int i = 0; i < qtd; i++) {
			System.out.printf("Emplyoee #%d\n", i+1);
			System.out.print("Id: \n");
			id = scanner.nextInt();
			
			System.out.print("Name: \n");
			scanner.nextLine();
			nome = scanner.nextLine();
			
			System.out.print("Salary: \n");
			salario = scanner.nextDouble();
			
			funcionario = new Funcionario(id, nome, salario);
			
			list.add(funcionario);
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int idBusca = scanner.nextInt(); 

		Funcionario resultado = list.stream()
		                            .filter(x -> x.getId() == idBusca) 
		                            .findFirst()
		                            .orElse(null);
		
		if(resultado != null) {
			System.out.println("Enter the percentage: ");
			aumento = scanner.nextDouble();
			resultado.aumento(aumento);
			
			for(Funcionario empregado : list) {
				System.out.println(empregado);
			}
		}else {
			System.out.println("FUNCIONARIO NAO ENCONTRADO");
		}
		
		
		scanner.close();
	}
}
