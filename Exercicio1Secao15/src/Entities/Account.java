package Entities;

import Exceptions.BusinessException;

public class Account {

	private int number;
	private String holder;
	private double balance;
	private double withDrawLimit;

	public Account(int number, String holder, double withDrawLimit) {
		this.number = number;
		this.holder = holder;
		this.withDrawLimit = withDrawLimit;
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public double getBalance() {
		return balance;
	}

	public double getWithDrawLimit() {
		return withDrawLimit;
	}

	public void deposit(Double amount) {
		balance += amount;
	}

	public void withDraw(Double amount) throws BusinessException {

		if (amount > getBalance()) {
			throw new BusinessException("Withdraw error: Not enough balance");
		} else if (amount > getWithDrawLimit()) {
			throw new BusinessException("Withdraw error: The amount exceeds withdraw limit");
		} else {
			balance -= amount;
			System.out.println("New balance: " + getBalance());
		}
	}

}
