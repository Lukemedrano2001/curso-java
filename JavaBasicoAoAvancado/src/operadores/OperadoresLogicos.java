package operadores;

public class OperadoresLogicos {
	public static void main(String[] args) {
		// Trabalho1 e Trabalho2 podem ser V ou F
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		// TV de 50 caso os dois trabalhos sejam confirmados
		boolean tv50 = trabalho1 && trabalho2;
		// TV de 32 caso somente um dos trabalhos sejam confirmados
		boolean tv32 = trabalho1 ^ trabalho2;
		
		// Sorvete caso um dos dois trabalhos ocorram
		boolean sorvete = tv50 || tv32;
		
		// Fica em casa caso não tenha sorvete
		boolean ficaEmCasa = !sorvete;
		
		System.out.println("TV de 50: " + tv50);
		System.out.println("TV de 32: " + tv32);
		System.out.println("Sorvete: " + sorvete);
		System.out.println("Fica em casa: " + ficaEmCasa);
	}
}
