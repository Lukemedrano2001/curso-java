package operadores;

public class OperadoresRelacionais {
	public static void main(String[] args) {
		int a = 97;
		int b = 'a';
		boolean valor = a == b;
		
		System.out.println("Tabela Unicode (a == b): " + valor);
		
		System.out.println(3 > 4);	// Maior
		System.out.println(3 < 4);	// Menor
		System.out.println(3 >= 4);	// Maior ou igual
		System.out.println(3 <= 4);	// Menor ou igual
		System.out.println(3 != 4);	// Diferente
		System.out.println(3 == 4);	// Igual
	}
}