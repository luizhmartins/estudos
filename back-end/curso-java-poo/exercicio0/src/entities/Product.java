package entities;

public class Product {

	private String name;
	private double price;
	private int quantity;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double totalValueInStock() {
		return this.quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return "Product data: "
				+ this.name
				+ ", $ "
				+ this.price
				+", "
				+ this.quantity
				+ " units, "
				+ "Total: "
				+ this.quantity * this.price;
	}
}
