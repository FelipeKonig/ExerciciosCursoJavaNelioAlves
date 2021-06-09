package model.services;

public interface OnlinePaymentService {

	public double simpleInterest(int month, double amount);

	public double PaymentFee(double amount);
}
