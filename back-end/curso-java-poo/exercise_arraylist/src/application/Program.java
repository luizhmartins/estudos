package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employees will be resitered? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Employee #" + (i+1));
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			while(hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			list.add(i, new Employee(id, name, salary));
		}
		System.out.println();
		System.out.print("Enter the employee id what will have salary increase: ");
		int employeeId = sc.nextInt();
		
		Employee id = list.stream().filter(x -> x.getId() == employeeId).findFirst().orElse(null);
		
		if(id != null) {
			System.out.print("Enter the porcentage: ");
			double porcentage = sc.nextDouble();
			id.increase(porcentage);
		}else {
			System.out.println("This id does not exist!");
		}
		System.out.println();
		for(Employee x : list) {
			System.out.println(x);;
		}
		
		
		sc.close();

	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
