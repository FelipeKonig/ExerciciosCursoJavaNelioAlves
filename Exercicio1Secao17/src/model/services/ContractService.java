package model.services;

import java.util.Calendar;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

	private OnlinePaymentService paymentService;

	public ContractService(OnlinePaymentService paymentService) {
		this.paymentService = paymentService;
	}

	public void processContract(Contract contract, int months) {

		Double amount = contract.getTotalValue() / months;

		for (int month = 1; month <= months; month++) {

			double amountInstallment = paymentService.simpleInterest(month, amount);

			amountInstallment = paymentService.PaymentFee(amountInstallment);

			Calendar dueDate = Calendar.getInstance();
			dueDate.setTime(contract.getDate());
			dueDate.add(Calendar.MONTH, month);

			Installment installment = new Installment(dueDate.getTime(), amountInstallment);

			contract.getListInstallments().add(installment);
		}
	}

}
