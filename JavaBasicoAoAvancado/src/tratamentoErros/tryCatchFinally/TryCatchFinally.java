package tratamentoErros.tryCatchFinally;

import java.util.Scanner;

public class TryCatchFinally {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Digite um número:");
			int numero = scanner.nextInt();
			System.out.println(7 / numero);
		} catch(Exception excecao) {
			System.out.println("Exceção: " + excecao.getMessage());
		} finally {
			System.out.println("Finally...");
			scanner.close();
		}
		
		System.out.println("Fim");
	}
}