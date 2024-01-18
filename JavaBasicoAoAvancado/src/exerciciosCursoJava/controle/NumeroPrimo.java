package exerciciosCursoJava.controle;

import java.util.Scanner;

public class NumeroPrimo {
	public static void main(String[] args) {
		// Números primos só podem ser inteiros positivos
		// Os números 2 e 3 são os menores números primos
		// Um número primo só pode ser divisivel por 1 e por ele mesmo
		
		System.out.println("Digite um número:");
		Scanner scanner = new Scanner(System.in);
		
		int numero = scanner.nextInt();
		int divisores = 0;
		
		if(numero < 2) {
			System.out.printf("O número %d não é primo.", numero);
		}else if(numero == 2 || numero == 3) {
			System.out.printf("O número %d é primo.", numero);
		}else {
			// Como o número 1 é o divisor universal, começamos a busca por divisores a partir do número 2.
            // O loop vai até o antecessor ao número digitado, pois o número primo é divisivel por 1 e pelo próprio número digitado
			for(int i = 2; i < numero; i++) {
				// Se encontrou um divisor, que não seja o número 1 ou o proprio numero, não é primo
				if(numero % i == 0) {
					divisores++;
					break;
				}
			}
			
			if(divisores > 0) {
				System.out.printf("O número %d não é primo.", numero);
			}else {
				System.out.printf("O número %d é primo.", numero);
			}
		}
		
		scanner.close();
	}
}