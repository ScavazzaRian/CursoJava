import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {
	/*
	 * Bloco que contem o codigo a ser executado independente de ter ocorrido ou nao
	 * uma excecao
	 * 
	 * Exemplo: Fechar um arquivo, conexao com o banco, ou outro recurso no final do
	 * processamento.
	 */
	public static void main(String[] args) {
		File file = new File("C:\\temp\\in.txt");
		Scanner scanner = null;

		try {
			// A classe scanner pode ler arquivos
			scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error opening file: " + e.getMessage());
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}

	}
}
