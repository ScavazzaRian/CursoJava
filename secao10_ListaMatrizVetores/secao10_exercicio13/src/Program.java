import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int linhas, colunas,num;
		Integer[][] matriz;
		
		linhas = scanner.nextInt();
		colunas = scanner.nextInt();
		
		matriz = new Integer[linhas][colunas];
		
		for(int i = 0; i < linhas; i++) {
			for(int j = 0; j < colunas; j++) {
				matriz[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("Numero procurado: ");
		num = scanner.nextInt();
		
		for(int i = 0; i < linhas; i++) {
            for(int j = 0; j < colunas; j++) {
                if(matriz[i][j] == num) {
                    System.out.printf("Position %d,%d: \n", i, j);
                    if (j > 0) {
                        System.out.println("Esquerda: " + matriz[i][j-1]);
                    }
                    if (j < colunas - 1) {
                        System.out.println("Direita: " + matriz[i][j+1]); 
                    }
                    if (i > 0) {
                        System.out.println("Cima: " + matriz[i-1][j]);
                    }
                    if (i < linhas - 1){
                        System.out.println("Baixo: " + matriz[i+1][j]);
                    }
                }
            }
        }
		
		scanner.close();
	}
}
