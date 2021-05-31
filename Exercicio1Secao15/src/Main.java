import java.util.Locale;
import java.util.Scanner;

import Entities.Account;
import Exceptions.BusinessException;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();

		sc.nextLine();
		System.out.print("Holder: ");
		String holder = sc.nextLine();

		System.out.print("Initial balance: ");
		double amount = sc.nextDouble();

		System.out.print("Withdraw limit: ");
		double withDrawLimit = sc.nextDouble();

		Account account = new Account(number, holder, withDrawLimit);
		account.deposit(amount);

		System.out.print("Enter amount for withdraw: ");
		amount = sc.nextDouble();
		
		try {
			account.withDraw(amount);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
		
		sc.close();
		
	}

}
