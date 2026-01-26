package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import model.User;

public class Program {
	public static void main(String[] args) {
		DateTimeFormatter fmt1 = DateTimeFormatter.ISO_DATE_TIME;
		Set<User> set = new HashSet<>();
		Scanner scanner = new Scanner(System.in);
		String strPath;
		
		System.out.println("Enter file full path: ");
		strPath = scanner.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(strPath))){
			String linha = br.readLine();
			while (linha != null) {
				String[] conteudo = linha.split(" ");
				set.add(new User(conteudo[0], LocalDateTime.parse(conteudo[1], fmt1)));
				linha = br.readLine();
			}
			
			System.out.println("Total de usuários únicos: " + set.size());
		} catch(IOException e) {
			System.out.println("Error: " + e);
		}
		
		scanner.close();
	}
}
