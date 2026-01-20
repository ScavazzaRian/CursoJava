import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Pessoa> pessoas = new ArrayList<>();
		int quantidadeCadastros, quantidadeFuncionarios;
		char tipoPessoa;
		String nomePessoa;
		double arrecadamentoAnual, despesasMedicas;
		
		System.out.print("Enter the number of tax payers: ");
		quantidadeCadastros = scanner.nextInt();
		
		for(int i = 0; i < quantidadeCadastros; i++) {
			System.out.printf("Tax payer #%d data: \n", i+1);
			System.out.print("Individual or company (i/c)? ");
			tipoPessoa = scanner.next().charAt(0);
			
			System.out.print("Name: ");
			scanner.nextLine();
			nomePessoa = scanner.nextLine();
			
			System.out.print("Anual income: ");
			arrecadamentoAnual = scanner.nextDouble();
			
			// Regra tipo pessoa
			if(tipoPessoa == 'i') {
				System.out.print("Health expenditures: ");
				despesasMedicas = scanner.nextDouble();
				
				pessoas.add(new PessoaFisica(nomePessoa, arrecadamentoAnual, despesasMedicas));
			}else {
				System.out.print("Numbers of employees: ");
				quantidadeFuncionarios = scanner.nextInt();
				
				pessoas.add(new PessoaJuridica(nomePessoa, arrecadamentoAnual, quantidadeFuncionarios));
			}
		}
		
		double total = 0;
		System.out.print("TAXES PAID: ");
		for(Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getNome() + ": $ " + String.format("%.2f", pessoa.pagamentoImposto()));
			total += pessoa.pagamentoImposto();
		}
		System.out.printf("TOTAL TAXES: $ %.2f", total);
		
		scanner.close();
	}
}
