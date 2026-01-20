import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {
	public static void main(String[] args) throws ParseException {
		String departament, name, level;
		Double baseSalary, valuePerHour;
		Integer quantity, duration;
		Worker worker;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter departament's name: \n");
		departament = scanner.nextLine();
		
		System.out.println("Enter worker date: ");
		System.out.print("Name: \n");
		name = scanner.nextLine();
		
		System.out.print("Level: \n");
		level = scanner.nextLine();
		
		System.out.print("Base salary: \n");
		baseSalary = scanner.nextDouble();
		
		worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(departament));
		
		System.out.print("How many contracts to this worker? \n");
		quantity = scanner.nextInt();
		
		for(int i = 0; i < quantity; i++) {
			System.out.printf("Enter the contract #%d data: \n", i + 1);
			System.out.println("Date (DD/MM/YYYY): ");
			
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			Date date = formatter.parse(scanner.next());
			
			System.out.println("Value per hour: ");
			valuePerHour = scanner.nextDouble();
			
			System.out.println("Duration (hours): ");
			duration = scanner.nextInt();
			
			HourContract contrato = new HourContract(date, valuePerHour, duration);
			
			worker.addContract(contrato);
		}
		
		System.out.println();
		System.out.println("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = scanner.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Departament: " + worker.getDepartament().getName());
		System.out.println("Income for " + monthAndYear + ": " + worker.income(year, month));
		
		scanner.close();
		
		//USAR LOCAL DATE E MAIS ATUAL
	}
}
