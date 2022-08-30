package heranca;

public class Gerente extends Funcionario{

	private int senha;
	
	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario();
	}
}