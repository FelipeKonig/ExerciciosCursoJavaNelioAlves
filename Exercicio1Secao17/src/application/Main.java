package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.services.ContractService;
import model.services.PayPalService;

public class Main {

	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter contract data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Date (dd/MM/yyy): ");
		Date date = sdf.parse(sc.nextLine());
		System.out.print("Contract value: ");
		Double totalValue = sc.nextDouble();

		Contract contract = new Contract(number, date, totalValue);

		System.out.print("Enter number of installments: ");
		int months = sc.nextInt();

		ContractService contractService = new ContractService(new PayPalService());
		contractService.processContract(contract, months);

		System.out.println("Installments:");
		Arrays.asList(contract.getListInstallments()).stream().forEach(s -> System.out.println(s));

		sc.close();

	}

}
