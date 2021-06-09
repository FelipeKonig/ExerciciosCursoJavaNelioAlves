package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {

	private int number;
	private Date date;
	private Double totalValue;

	private List<Installment> listInstallments = new ArrayList<>();

	public Contract(int number, Date date, Double totalValue) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}

	public int getNumber() {
		return number;
	}

	public Date getDate() {
		return date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public List<Installment> getListInstallments() {
		return listInstallments;
	}

}
