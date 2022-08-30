
public class TestaCaracteres {
	public static void main(String[] args) {
		char letra = 'a';
		System.out.println(letra);
		
		char outraLetra = 66; // A tipo char na verdade guarda um código da tabela unicode
		System.out.println(outraLetra);
		
		outraLetra = (char)(outraLetra + 1);
		System.out.println(outraLetra);
		
		String palavra = "Curso de Java da Alura";
		System.out.println(palavra);
		
		System.out.println(palavra + 2020);
	}
}
