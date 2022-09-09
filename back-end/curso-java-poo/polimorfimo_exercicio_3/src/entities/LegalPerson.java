package entities;

public class LegalPerson extends Taxpayer {
	
	private Integer numberEmployees;
	
	public LegalPerson() {
		super();
	}
	
	public LegalPerson(String name, Double annualIncome, Integer numberEmployees) {
		super(name, annualIncome);
		this.numberEmployees = numberEmployees;
	}

	@Override
	public double calcTax() {
		if(this.numberEmployees > 10) {
			return super.getAnnualIncome() * 0.14;
		}else {
			return super.getAnnualIncome() * 0.16;
		}
	}

	@Override
	public String toString() {
		return super.getName()
				+ ", $ "
				+ String.format("%.2f", super.getAnnualIncome())
				+ " - Tax: $ "
				+ String.format("%.2f", this.calcTax())
				+ " (Number of employees: "
				+ this.numberEmployees
				+ ")";
	}

}
