import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Main {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter client data:");

		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.print("Email:");
		String email = sc.nextLine();

		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());

		Client client = new Client(name, email, birthDate);

		OrderStatus status = OrderStatus.PROCESSING;

		Date moment = Calendar.getInstance().getTime();
		Order order = new Order(moment, status, client);

		System.out.println("Enter other data:");

		System.out.print("Status: " + order.getStatus() + "\n");

		System.out.print("How many items to this order? ");
		int quantity = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= quantity; i++) {
			System.out.println("Enter #" + i + " item data:");

			System.out.print("Product name: ");
			name = sc.nextLine();

			System.out.print("Product price:");
			double price = sc.nextDouble();

			System.out.print("Quantity:");
			int quantityProduct = sc.nextInt();
			sc.nextLine();

			Product product = new Product(name, price);

			OrderItem orderItem = new OrderItem(quantityProduct, product.getPrice(), product);

			order.addItem(orderItem);

		}

		System.out.println(order);

		sc.close();
	}

}
