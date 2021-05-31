package Exercicio3;

public class Student {

	private String name;
	private Double n1, n2, n3,n4, media;

	public Student(String name, Double n1, Double n2, Double n3, Double n4) {
		super();
		this.name = name;
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		this.n4 = n4;
	}

	public double calculateMedia() {
		media = ((n1 * 30) + (n2 * 30) + (n3 * 35) + (n4 * 35)) / 100; 
		return media;
	}

	public double calculateRemainder() {
		return 6 - media;
	}

	@Override
	public String toString() {
		if (media >= 6) {
			return "FINAL GRADE = " + String.format("%.2f", calculateMedia()) + " PASS";
		} else {
			return "FINAL GRADE = " + String.format("%.2f", calculateMedia()) + " FAILED " + "MISSING "
					+ String.format("%.2f", calculateRemainder()) + " POINTS";
		}
	}
}
