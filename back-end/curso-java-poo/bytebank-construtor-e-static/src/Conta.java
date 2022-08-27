
public class Conta {
	
	private double saldo;
	private int agencia;
	private int numero;
	private static int total;
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 100;
	}
	
	public boolean saca(int valor) {
		if(this.saldo > 0 && this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
	return false;
	}
	
	public boolean deposita(int valor) {
		if(valor > 0) {
			this.saldo += valor;
			return true;
		}
	return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}
