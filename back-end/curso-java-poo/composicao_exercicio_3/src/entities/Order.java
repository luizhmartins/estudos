package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	public static DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	public static DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private LocalDateTime moment;
	private OrderStatus status;
	private List<OrderItem> orderItem = new ArrayList<>();
	private Client client;
	
	public Order(LocalDateTime moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getOrderItem() {
		return orderItem;
	}
	
	public void setClient(Client client) {
		this.client = client;
	}
	
	public Client getClient() {
		return client;
	}
	
	public void addItem(OrderItem item) {
		orderItem.add(item);
	}
	
	public void removeItem(OrderItem item) {
		orderItem.remove(item);
	}
	
	public double total() {
		double total = 0.0;
		for(OrderItem o : orderItem) {
			total += o.subTotal();
		}
		return total;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY:\n");
		sb.append("Order momment: " + this.getMoment().format(fmt1) + "\n");
		sb.append("Order Status: " + this.getStatus() + "\n");
		sb.append("Client: " + this.getClient().getName());
		sb.append(" (" + this.client.getBirthDate().format(fmt2) + ")");
		sb.append(" - " + this.client.getEmail() + "\n");
		sb.append("Order Items:\n");
		for(OrderItem o : orderItem) {
			sb.append(o + "\n");
		}
		sb.append("Total Price: $" + this.total());
		return sb.toString();
	}
}
