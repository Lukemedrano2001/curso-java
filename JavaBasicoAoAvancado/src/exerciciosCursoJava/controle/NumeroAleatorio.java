package exerciciosCursoJava.controle;

import java.util.Random;
import java.util.Scanner;

public class NumeroAleatorio {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int numeroAleatorio = random.nextInt(101);
		
		// 10 Tentativas
		for(int i = 10; i >= 0; i--) {
			if(i == 0) {
				System.out.println("Número Aleatório: " + numeroAleatorio);
				break;
			}
			
			System.out.println("Tentativas restantes: " + i);
			System.out.println("Digite um número de 0 a 100");
			int numero = scanner.nextInt();
			
			// If que verifica se acertou ou não o numero aleatorio, se é == ou > ou <
			if(numero == numeroAleatorio) {
				System.out.println("Você acertou o número aleatório: " + numero);
				break;
			}else if(numero > numeroAleatorio) {
				System.out.println("Tente um número menor que: " + numero);
			}else {
				System.out.println("Tente um número maior que: " + numero);
			}
		}
		
		
		scanner.close();
	}
}
