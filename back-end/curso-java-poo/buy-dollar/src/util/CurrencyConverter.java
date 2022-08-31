package util;

public class CurrencyConverter {

	private double dollarPrice;
	private double quantityDollars;
	
	public void setQuantityDollars(double quantityDollars) {
		this.quantityDollars = quantityDollars;
	}
	
	public void setDollarPrice(double dollarPrice) {
		this.dollarPrice = dollarPrice;
	}
	
	public double getCalc() {
		double tot = this.dollarPrice * this.quantityDollars;
		return tot += this.quantityDollars * 0.06;
	}
}
