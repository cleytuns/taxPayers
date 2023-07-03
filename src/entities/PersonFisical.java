package entities;

public class PersonFisical extends Person {

	private Double healthExpenditures;
	
	public PersonFisical() {
		super();
	}
	
	public PersonFisical(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}



	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		double tax;
		
		if (anualIncome < 20000.00) {
			tax = anualIncome * 0.15;
		}
		else {
			tax = anualIncome * 0.25;
		}
		
		double taxHealthExpenditures = healthExpenditures * 0.5;
		tax -= taxHealthExpenditures;
		
		return tax;
	}
	

}
