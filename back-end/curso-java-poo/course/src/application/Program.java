package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x = new Triangle();
		Triangle y = new Triangle();
		
		System.out.println("Enter the measures of Triangle X: ");
		x.setA(sc.nextDouble());
		x.setB(sc.nextDouble());
		x.setC(sc.nextDouble());
		System.out.println("Enter the measures of Triangle Y: ");
		y.setA(sc.nextDouble());
		y.setB(sc.nextDouble());
		y.setC(sc.nextDouble());
		
		double areaX = x.calculatorAreaTriangle();
		double areaY = y.calculatorAreaTriangle();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Larger area: X");
		}else {
			System.out.println("Larger area: Y");
		}
		sc.close();
	}

}
