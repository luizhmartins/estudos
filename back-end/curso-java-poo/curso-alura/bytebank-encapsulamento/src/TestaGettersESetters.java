
public class TestaGettersESetters {
	
	public static void main(String[] args) {
	
		Conta contaDoLuiz = new Conta();
		Cliente luiz = new Cliente();
		
		contaDoLuiz.setTitular(luiz);
		
		luiz.setNome("Jorge");
		System.out.println(luiz.getNome());
		
		contaDoLuiz.getTitular().setNome("Joaquin");
		
		// System.out.println(luiz.getNome()); OU
		System.out.println(contaDoLuiz.getTitular().getNome());
		
	}
}
