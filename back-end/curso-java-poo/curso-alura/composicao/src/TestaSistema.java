
public class TestaSistema {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSalario(100);
		g.setNome("Luiz");
		g.setSenha(2222);
		
		Cliente c = new Cliente();
		c.setSenha(222);
		
		SistemaInterno sistema = new SistemaInterno();
		
		sistema.autentica(g);
		sistema.autentica(c);
	}
}
