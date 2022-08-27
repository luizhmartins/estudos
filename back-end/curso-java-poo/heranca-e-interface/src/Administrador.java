
public class Administrador extends Funcionario implements Autenticavel {

	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 200;
	}
	
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}

}
