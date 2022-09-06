package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		int[][] matriz = new int[r][c];
		int cont = 0;
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
				if(matriz[i][j] < 0) {
					cont++;
				}
			}
		}
		System.out.println();
		System.out.println("Matrix: " + r + "/" + c);
		System.out.println();
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Main diagonal:");
		
		for(int i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		System.out.println();
		System.out.println("Negative numbers: " + cont);
		
		
		sc.close();

	}

}
