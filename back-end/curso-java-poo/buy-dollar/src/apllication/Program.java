package apllication;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CurrencyConverter cc = new CurrencyConverter();
		
		System.out.print("What is the dollar price? ");
		cc.setDollarPrice(sc.nextDouble());
		System.out.print("How many dollars will be bought? ");
		cc.setQuantityDollars(sc.nextDouble());
		System.out.println("Amount to be paid in reais = " + cc.getCalc());
		
		sc.close();

	}

}
