package model.entities;

import java.util.Date;

import application.Main;

public class Installment {

	private Date dueDate;
	private Double amount;

	public Installment(Date dueDate, Double amount) {
		this.dueDate = dueDate;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return Main.sdf.format(dueDate) + " - " + String.format("%.2f", amount);
	}

}
