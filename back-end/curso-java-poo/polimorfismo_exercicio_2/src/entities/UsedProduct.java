package entities;

import java.time.LocalDate;

public class UsedProduct extends Product {

	private LocalDate manufactureDate;
	
	public UsedProduct() {
		super();
	}
	
	public UsedProduct(String name, Double price, LocalDate manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String priceTag() {
		return super.getName() 
				+ " (Used) $ " 
				+ String.format("%.2f", super.getPrice()) 
				+ " (Manufacture date: " 
				+ this.manufactureDate.format(fmt1) + ")";
	}
}
