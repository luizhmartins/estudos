package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product[] prod = new Product[n];
		double sum = 0.0;
		
		for(int i = 0; i < prod.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			prod[i] = new Product(name, price);
			sum += prod[i].getPrice();
		}
		
		double avg = sum / prod.length;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		
		sc.close();

	}

}
