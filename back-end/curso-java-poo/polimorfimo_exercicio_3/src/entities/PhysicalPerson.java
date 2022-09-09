package entities;

public class PhysicalPerson extends Taxpayer {
	
	private Double healthSpending;
	
	public PhysicalPerson() {
		super();
	}
	
	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}

	public PhysicalPerson(String name, Double annualIncome, Double healthSpending) {
		super(name, annualIncome);
		this.healthSpending = healthSpending;
	}

	@Override
	public double calcTax() {
		double tax = 0.0;
		if(super.getAnnualIncome() < 20000.00) {
			tax = super.getAnnualIncome() * 0.15;
		}else {
			tax = super.getAnnualIncome() * 0.25;
		}
		if(this.healthSpending > 0.0) {
			return tax - (this.healthSpending * 0.5);
		}else {
			return tax;
		}
	}

	@Override
	public String toString() {
		return super.getName()
				+ ", $ "
				+ String.format("%.2f", super.getAnnualIncome())
				+ " - Tax: $ "
				+ String.format("%.2f", this.calcTax())
				+ " (Health Spending: "
				+ String.format("%.2f", this.healthSpending)
				+ ")";
	}

}
