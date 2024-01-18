package exerciciosCursoJava.controle;

import java.util.Scanner;

public class CalculaNotasSomaMedia {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota:");
		double nota1 = scanner.nextDouble();
		
		System.out.println("Digite a segunda nota:");
		double nota2 = scanner.nextDouble();
		
		double somaNotas = 0;
		double mediaNotas = 0;
		
		// As notas precisam estar entre 0 e 10 para que seja feita a soma e média, caso uma ou as duas notas não estejam no intervalo, as notas são inválidas.
		if(nota1 >= 0 && nota1 <= 10 && nota2 >= 0 && nota2 <= 10) {
			somaNotas = nota1 + nota2;
			mediaNotas = somaNotas / 2;
			System.out.printf("Nota 1: %.2f | Nota 2: %.2f | Soma: %.2f | Média: %.2f \n", nota1, nota2, somaNotas, mediaNotas);
			
			// Condicional que diz se está aprovado, recuperação ou reprovado
			if(mediaNotas >= 7) {
				System.out.println("Aprovado");
			}else if(mediaNotas < 7 && mediaNotas > 4) {
				System.out.println("Recuperação");
			}else {
				System.out.println("Reprovado");
			}
		}else {
			System.out.println("Notas inválidas.");
		}
		
		
		
		scanner.close();
	}
}
