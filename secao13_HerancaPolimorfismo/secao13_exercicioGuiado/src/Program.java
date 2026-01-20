import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int qtd, hours;
		double valuePerHour, additional;
		char op;
		String name;
		List<Employee> empregados = new ArrayList<>();
		
		System.out.println("Enter the number of employess: ");
		qtd = scanner.nextInt();
		
		for(int i = 0; i < qtd; i++) {
			System.out.printf("Exployee #%d data", i+1);
			System.out.print("Outsourced (y/n): ");
			op = scanner.next().charAt(0);
			
			System.out.print("Name: ");
			scanner.nextLine();
			name = scanner.nextLine();
			
			System.out.print("Hours: ");
			hours = scanner.nextInt();
			
			System.out.print("Value per hour: ");
			valuePerHour = scanner.nextDouble();
			
			if(op == 'y') {
				System.out.print("Value per hour: ");
				additional = scanner.nextDouble();
				empregados.add(new OutsourcedEmployee(name, hours, valuePerHour, additional));
			}else {
				empregados.add(new Employee(name, hours, valuePerHour));
			}
		}
		
		System.out.println();
		System.out.println("PAYMENTS: ");
		for(Employee emp : empregados) {
			System.out.println(emp.getName()+ " - $ " + String.format("%.2f", emp.payment()));
		}
		
		scanner.close();
	}
}
