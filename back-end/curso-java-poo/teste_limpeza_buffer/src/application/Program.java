package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Idade: ");
		int idade = sc.nextInt();
		System.out.print("Profissão: ");
		sc.nextLine();
		String profissao = sc.nextLine();
		
		System.out.println("Nome: " 
							+ nome 
							+ ", Idade: " 
							+ idade
							+", Profissão: "
							+ profissao);
		
		sc.close();
	}

}
