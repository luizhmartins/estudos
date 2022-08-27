
public class Conta {
	
	private double saldo;
	private int agencia;
	private int numero;
	
	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public boolean saca(double valor) {
		if(this.saldo > 0 && this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
	return false;
	}

	public boolean transfere(double valor, Conta destino) {
		if(this.saca(valor)) {
			destino.deposita(valor);
			return true;
		}
	return false;
	}
	
	public boolean deposita(double valor) {
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
	
}
