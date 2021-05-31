package entities;

public class OrderItem {

	private int quantity;
	private double price;

	private Product product;

	public OrderItem(int quantity, double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Double subTotal() {
		return price * quantity;
	}

	public Product getProduct() {
		return product;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return product + ", Quantity: " + quantity +", Subtotal: $" + subTotal();
	}

}
