package Exercicio2;

public class Employee {

	private String name;
	private Double grossSalary, tax;

	public Employee(String name, Double grossSalary, Double tax) {
		super();
		this.name = name;
		this.grossSalary = grossSalary;
		this.tax = tax;
	}

	public Double netSalary() {
		return grossSalary - tax;
	}

	public void increaseSalary(Double percentage) {
		grossSalary += grossSalary * percentage / 100.0;
	}

	@Override
	public String toString() {
		return this.name + " $ " + String.format("%.2f", netSalary());
	}

}
