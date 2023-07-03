package entities;

public class PersonLegal extends Person {

	private Double numberEmployees;
	
	public PersonLegal() {
		super();
	}
	
	public PersonLegal(String name, Double anualIncome, Double numberEmployees) {
		super(name, anualIncome);
		this.numberEmployees = numberEmployees;
	}
	
	public Double getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(Double numberEmployees) {
		this.numberEmployees = numberEmployees;
	}

	@Override
	public double tax() {
		double tax;

		if (numberEmployees > 10) {
			tax = anualIncome * 0.14;
		} else {
			tax = anualIncome * 0.16;
		}

		return tax;
	}

}
