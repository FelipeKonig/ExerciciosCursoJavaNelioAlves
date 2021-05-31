package Entities;

public class Employee {

	private int id;
	private String name;
	private Double salary;

	public Employee(int id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Double increaseSalary(Double percentage) {
		salary += salary * (percentage / 100);
		return salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}

}
