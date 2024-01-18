package exerciciosCursoJava.controle;

import java.util.Scanner;

public class MaiorMenorNumero {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Intervalo dos números inteiros +- 2.147.483.647
		int maiorValor = Integer.MAX_VALUE;	// Maior valor possível dentro dos inteiros em java
		int menorValor = Integer.MIN_VALUE;	// Menor valor possível dentro dos inteiros em java
		for(int i = 0; i < 10; i++ ) {
			System.out.println("Digite um número:");
			int numero = scanner.nextInt();
			
			if(numero > maiorValor) {
				maiorValor = numero;
			}else if(numero < menorValor) {
				menorValor = numero;
			}
		}
		
		System.out.printf("Maior valor: %d | Menor valor: %d", maiorValor, menorValor);
		
		scanner.close();
	}
}
