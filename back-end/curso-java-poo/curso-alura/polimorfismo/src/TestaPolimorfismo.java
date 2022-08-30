
public class TestaPolimorfismo {

	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		f.setSalario(1000);
		
		Gerente g = new Gerente();
		g.setSalario(2000);
		
		ControleBonificacao controle = new ControleBonificacao();
		
		System.out.println(controle.registra(f));
		System.out.println(controle.registra(g));

	}
}

