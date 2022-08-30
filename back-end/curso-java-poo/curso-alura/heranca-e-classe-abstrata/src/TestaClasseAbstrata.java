
public class TestaClasseAbstrata {

	public static void main(String[] args) {
		
		//Funcionario f = new Funcionario();
		Gerente g = new Gerente();
		EditorVideo ev = new EditorVideo();
		Designer d = new Designer();
		
		//f.setSalario(1000.0);
		g.setSalario(1000.0);
		ev.setSalario(1000.0);
		d.setSalario(1000.0);
		
		//System.out.println("F Boni: " + f.getBonificacao());
		System.out.println("G Boni: " + g.getBonificacao());
		System.out.println("EV Boni: " + ev.getBonificacao());
		System.out.println("D Boni: " + d.getBonificacao());
	}
}
