package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Inicializado vetor com valores
		
//		int vet[] = new int[] {1, 2, 3};
//		
//		for(int x : vet) {
//			System.out.print(x + " ");
//		}
		
		int n = sc.nextInt();
		double sum = 0.0;
		
		double[] vect = new double[n];
		
		for(int i = 0; i < vect.length; i++) {
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}
		
		double avg = sum / vect.length;
		
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
		
		sc.close();

	}

}
