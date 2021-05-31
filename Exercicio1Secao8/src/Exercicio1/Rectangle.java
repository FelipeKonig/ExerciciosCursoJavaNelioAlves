package Exercicio1;

public class Rectangle {

	public Double width, height;

	public Rectangle(Double width, Double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public double area() {
		double value = this.width * this.height;

		return value;

	}

	public double perimeter() {
		double value = (this.width * 2) + (this.height * 2);

		return value;

	}

	public double diagonal() {
		double value = Math.sqrt(Math.pow(this.width, 2) + Math.pow(this.height, 2));

		return value;

	}

}
