package entities;

import java.util.ArrayList;
import java.util.Date;

import entities.enums.OrderStatus;

public class Order {

	private Date moment;
	private OrderStatus status;

	private Client client;
	private ArrayList<OrderItem> listOrderItems = new ArrayList<>();

	public Order(Date moment, OrderStatus status, Client client) {
		super();
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public void addItem(OrderItem orderItem) {
		listOrderItems.add(orderItem);
	}

	public void removeItem(OrderItem orderItem) {
		listOrderItems.remove(orderItem);
	}

	public ArrayList<OrderItem> getListOrderItems() {
		return listOrderItems;
	}

	public Double total() {
		double total = 0;

		for (OrderItem o : listOrderItems) {
			total += o.subTotal();
		}

		return total;
	}

	public Client getClient() {
		return client;
	}

	public Date getMoment() {
		return moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public String toString() {
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("ORDER SUMMARY:" + "\n");
		stringBuilder.append("Client: " + client + "\n");
		stringBuilder.append("Order items:" + "\n");

		for (OrderItem orderItem : listOrderItems) {
			stringBuilder.append(orderItem + "\n");
		}
		stringBuilder.append("Total price: $" + total() + "\n");
		stringBuilder.append("Order moment: " + moment + "\n" + "Order status: " + status + "\n");

		return stringBuilder.toString();
	}

}
