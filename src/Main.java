import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Person;
import entities.PersonFisical;
import entities.PersonLegal;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Person> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Tax payer " + i + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual Income: ");
			double anualIncome = sc.nextDouble();
			
			if (ch == 'i') {
				System.out.print("Health Expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new PersonFisical(name, anualIncome, healthExpenditures));
			}
			else {
				System.out.print("Number of Employees: ");
				double numberEmployees = sc.nextDouble();
				list.add(new PersonLegal(name, anualIncome, numberEmployees));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID: ");
		
		double totalTaxes = 0.0;
		for (Person person : list) {
	        double tax = person.tax();
	        totalTaxes += tax;
			System.out.println(person.name + " $ " + String.format("%.2f", person.tax()));
			
		}
		
		System.out.println();
		System.out.println("TAXES PAID: $" + String.format("%.2f", totalTaxes));
		
		
		sc.close();
	}
}
