package exerciciosCursoJava.controle;

import java.util.Scanner;

public class WhileNumerosPositivos {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero = 0;
		while(numero != -1) {
			System.out.println("Digite um número (-1 para sair):");
			numero = scanner.nextInt();
			
			if(numero == -1) {
				break;
			}else {
				System.out.printf("Número: %d \n", numero);
			}
		}
		
		scanner.close();
	}
}
