package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> employees = new ArrayList<>();

		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char op = sc.next().charAt(0);

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hour: ");
			int hour = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			if(op == 'n') {
				employees.add(new Employee(name, hour, valuePerHour));
			}else {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				employees.add(new OutsourcedEmployee(name, hour, valuePerHour, additionalCharge));
			}
		}
		System.out.println();
		System.out.println("PAYMENTS:");
		for(Employee e : employees) {
			System.out.println(e.getName() + " - $ " + String.format("%.2f", e.payment()));
		}
		sc.close();
	}

}
