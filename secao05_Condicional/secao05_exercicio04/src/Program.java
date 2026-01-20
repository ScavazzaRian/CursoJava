import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int inicio, fim, duracao = 0;
		inicio = scanner.nextInt();
		fim = scanner.nextInt();
		
		if(inicio > fim) {
			duracao = 24 - inicio + fim;
		}else if (fim > inicio) {
			duracao = Math.abs(fim - inicio);
		}else {
			duracao = 24;
		}
		
		System.out.printf("O JOGO DUROU %d HORAS", duracao);
		
		scanner.close();
	}
}
