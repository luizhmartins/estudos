
public class TestaConstrutor {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 522);
		Conta conta2 = new Conta(654654, 88738);
		Conta conta3 = new Conta(11892, 83373);
		Conta conta4 = new Conta(648154, 7358);
		
		System.out.println(Conta.getTotal());
	}
}
