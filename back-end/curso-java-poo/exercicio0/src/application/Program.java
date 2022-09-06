package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product p = new Product();
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		p.setName(name);
		System.out.print("Price: ");
		double price = sc.nextDouble();
		p.setPrice(price);
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		p.addProducts(quantity);
		System.out.println(p);
		
		System.out.print("Enter the number to be added in stock: ");
		p.addProducts(sc.nextInt());
		System.out.println(p);
		System.out.print("Enter the number of products to be removed from stock: ");
		p.removeProducts(sc.nextInt());
		System.out.println(p);
		//p.toString();
		
		sc.close();

	}

}
