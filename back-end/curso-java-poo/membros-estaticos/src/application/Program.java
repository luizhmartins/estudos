package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;
import util.CalculatorEstatico;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		/*
		 * Testando classe membros NÃO ESTATICOS.
		 * Necessário instanciamento da classe para chamar os membros
		 * */
		Calculator calc = new Calculator();
		
		System.out.println("Enter the radius: ");
		double radius = sc.nextDouble();
		System.out.println("Circumference = " + calc.circumference(radius));
		System.out.println("Volume = " + calc.volume(radius));
		System.out.println("PI = " + calc.PI);
		
		/*
		 * Testando classe membros ESTATICOS.
		 * Apenas chamar o nome da classe e o membro estatico desejado
		 * */
		System.out.println("Enter the radius: ");
		double radiuss = sc.nextDouble();
		System.out.println("Circumference = " + String.format("%.4f", CalculatorEstatico.circumference(radiuss)));
		System.out.println("Volume = " + CalculatorEstatico.volume(radiuss));
		System.out.println("PI = " + CalculatorEstatico.PI);
		
		sc.close();
	}
}
