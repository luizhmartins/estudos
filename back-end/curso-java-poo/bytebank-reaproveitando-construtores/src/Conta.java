
public class Conta {
	
	private double saldo;
	private int agencia;
	private int numero;
	
	public Conta(int agencia, int numero, double saldo) {
		if(agencia > 133) {
			this.agencia = agencia;
			System.out.println(this.agencia);
		}else {
			this.agencia = 90;
			System.out.println(this.agencia);
		}
		if(numero > 522) {
			this.numero = numero;
			System.out.println(this.numero);
		}else {
			this.numero = 362;
			System.out.println(this.numero);
		}
		if(saldo > 500) {
			this.saldo = saldo;
			System.out.println(this.saldo);
		}else {
			this.saldo = 100;
			System.out.println(this.saldo);
		}
	}
	
	// Outro construtor que está reaproveitando as validações do construtor acima
	public Conta(int agencia, int numero) {
		this(agencia, numero, 100);
	}
}
