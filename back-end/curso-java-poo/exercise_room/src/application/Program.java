package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = 0;
		Client[] vect = new Client[10];
		
		
		System.out.print("How many rooms will be rented? ");
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Rent #" + i);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			vect[room-1] = new Client(name, email);
		}
		
		for(int i = 1; i <= vect.length; i++) {
			if(vect[i-1] != null) {
				System.out.println(i + ": " + vect[i-1]);							
			}
		}
		
		sc.close();

	}

}
