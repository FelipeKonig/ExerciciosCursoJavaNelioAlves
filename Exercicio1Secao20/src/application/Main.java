package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.ParseException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

import entities.Employee;

public class Main {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Set<Employee> employees = new HashSet<Employee>();

		System.out.print("Enter full file path: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {

				String[] fields = line.split(",");

				String name = fields[0];
				String email = fields[1];
				Double salary = Double.parseDouble(fields[2]);

				employees.add(new Employee(name, email, salary));

				line = br.readLine();
			}

			System.out.println("Enter salary:");
			Double salaryIO = sc.nextDouble();

			List<Employee> list = employees.stream()
					.filter(s -> s.getSalary() > salaryIO)
					.collect(Collectors.toList());

			System.out.println("Email of people whose salary is more than 2000.00:");

			list.forEach(System.out::println);

			Double sum = employees.stream()
					.filter(n -> n.getName().charAt(0) == 'M')
					.map(s -> s.getSalary())
					.reduce(0.0, (x, y) -> x + y);
			
			System.out.print("Sum of salary of people whose name starts with 'M': " + sum);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
	}

}
