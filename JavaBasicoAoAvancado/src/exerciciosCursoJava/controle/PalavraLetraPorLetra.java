package exerciciosCursoJava.controle;

import java.util.Scanner;

public class PalavraLetraPorLetra {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite uma palavra:");
		String palavra = scanner.next();
		
		for(int i = 0; i < palavra.length(); i++) {
			System.out.println(palavra.charAt(i));
		}
		
		scanner.close();
	}
}
