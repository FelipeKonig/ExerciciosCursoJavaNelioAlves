package App;

import java.util.Locale;
import java.util.Scanner;

import Entities.Employee;
import Repository.EmployeeDB;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		EmployeeDB employeeDB = new EmployeeDB();

		Employee employee;
		int id;

		System.out.println("How many employees will be registered?");

		int quantity = sc.nextInt();

		for (int i = 1; i <= quantity; i++) {
			System.out.println("");
			System.out.println("Employee " + "#" + i + ":");

			System.out.print("Id:");
			id = sc.nextInt();

			employee = employeeDB.getEmployee(id);

			if (employee != null) {
				do {
					System.out.println("This id already exists");
					System.out.print("New Id: ");
					id = sc.nextInt();

					employee = employeeDB.getEmployee(id);
				} while (employee != null);
			}

			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			employee = new Employee(id, name, salary);

			employeeDB.getListEmployee().add(employee);

		}

		System.out.println("");
		System.out.println("Enter the employee id that will have salary encrease: ");
		id = sc.nextInt();
		employee = employeeDB.getEmployee(id);

		if (employee == null) {
			System.out.println("This id not exist!");
		} else {
			sc.nextLine();

			System.out.println("Enter the percentage:");
			double percentage = sc.nextDouble();

			employee.increaseSalary(percentage);
		}

		System.out.println("");
		System.out.println("List of employees:");
		for (Employee employee2 : employeeDB.getListEmployee()) {
			System.out.println(employee2);
		}

		sc.close();

	}

}
