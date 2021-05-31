package Exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Name:");
		String name = sc.nextLine();
		System.out.println("Gross salary:");
		Double grossSalary = sc.nextDouble();
		System.out.println("Tax:");
		Double tax = sc.nextDouble();
		
		Employee employee = new Employee(name, grossSalary, tax);
		
		employee.netSalary();
		
		System.out.println("Employee: " + employee);
		
		System.out.println("Which percertange to encrease salary?");
		Double percentage = sc.nextDouble();
		
		employee.increaseSalary(percentage);
		
		System.out.println("Update data: " + employee);
		
		sc.close();
	}

}
