package entities;

public class Product {

	private int numero;
	private double valor;
	private double depositoInicial;
	
	public Product(int numero, double valor, double depositoInicial) {
		this.numero = numero;
		this.valor = valor;
		this.depositoInicial = depositoInicial;
	}
	
	public Product(int numero, double valor) {
		this(numero, valor, 0.0);
	}
	
}
