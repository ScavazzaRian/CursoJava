import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	/*
	 * Bloco Try:
	 * - Contem o codigo que representa a execucao normal do trecho de codigo que pode acarretar
	 * excecao
	 * 
	 * Bloco Catch:
	 * - Contem o codigo a ser executado caso uma excecao ocorra.
	 * - Deve ser especifico para o tipo da excecao a ser tratada.
	 */
	public static void main(String[] args) {
		method1();
	}
	
	public static void method1() {
		System.out.print("***METHOD1 START!***\n");
		method2();
		System.out.print("***METHOD2 END!***\n");
	}
	
	public static void method2() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("***METHOD2 START!***\n");
		
		try {
			String[] vect = scanner.nextLine().split(" ");
			int position = scanner.nextInt();
			System.out.println(vect[position]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.print("Invalid position!\n");
			e.printStackTrace();
		}
		catch(InputMismatchException e) {
			System.out.print("Input error!\n");
		}
		
		System.out.print("***METHOD2 END!***\n");
		System.out.print("Fim do programa!\n");
		
		scanner.close();
	}
}
