package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPerson;
import entities.PhysicalPerson;
import entities.Taxpayer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Taxpayer> taxpayer = new ArrayList<>();
		
		System.out.print("Enter the number of taxpayer: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Enter taxpeyer #" + i + " data:");
			System.out.print("Enter with the type taxpayer (p/l): ");
			char ch = sc.next().charAt(0);
			System.out.print("Name:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Annual income: ");
			double annualIncome = sc.nextDouble();
			if(ch == 'p') {
				System.out.print("Health espending: ");
				double healthSpending = sc.nextDouble();
				taxpayer.add(new PhysicalPerson(name, annualIncome, healthSpending));
			}else {
				System.out.print("Number of employees: ");
				int numberEmployees = sc.nextInt();
				taxpayer.add(new LegalPerson(name, annualIncome, numberEmployees));
			}
		}
		
		System.out.println();
		System.out.println("TAXPAYER TAX:");
		
		for(Taxpayer t : taxpayer) {
			System.out.println(t);
		}
		
		sc.close();
	}

}
