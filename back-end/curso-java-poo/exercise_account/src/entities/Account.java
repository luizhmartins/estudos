package entities;

public class Account {

	private int number;
	private String holder;
	private double balance;
	
	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		this.deposit(initialDeposit);
	}
	
	public Account(int number, String holder) {
		this(number, holder, 0.0);
	}
	
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		this.balance -= amount;
	}
	
	public String toString() {
 		return "\nAccount: " 
 				+ this.number 
 				+ ", " + "Holder: " 
 				+ this.holder + ", " 
 				+ "Balance: $ " 
 				+ this.balance;
	}
}
