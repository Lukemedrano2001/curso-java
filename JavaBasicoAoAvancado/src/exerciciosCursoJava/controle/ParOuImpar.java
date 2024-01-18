package exerciciosCursoJava.controle;

import java.util.Scanner;

public class ParOuImpar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int numero = scanner.nextInt();
		
		// If que verifica se está entre 0 e 10
		if(numero >= 0 && numero <= 10) {
			System.out.printf("O número %d está entre 0 e 10. \n", numero);	
		}else {
			System.out.printf("O número %d não está entre 0 e 10. \n", numero);
		}
		
		// If que verifica se é par ou ímpar
		if(numero % 2 == 0) {
				System.out.printf("Número %d é par.", numero);
		}else {
				System.out.printf("Número %d é ímpar.", numero);
		}
		
		scanner.close();
	}
}