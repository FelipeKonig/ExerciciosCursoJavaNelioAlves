package model.services;

public class PayPalService implements OnlinePaymentService {
	
	private static final double FEE_PERCENTAGE = 0.02;
	private static final double MONTHLY_INTEREST = 0.01;
	
	@Override
	public double simpleInterest(int month, double amount) {
		return amount + (amount * MONTHLY_INTEREST) * month;
	}

	@Override
	public double PaymentFee(double amount) {
		return amount + (amount * FEE_PERCENTAGE);
	}

}
