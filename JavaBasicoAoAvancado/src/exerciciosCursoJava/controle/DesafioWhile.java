package exerciciosCursoJava.controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double nota = 0;
		double somaNotas = 0;
		int quantidadeNotas = 0;
		
		while(nota != -1) {
			System.out.println("Digite a nota (ou -1 para sair):");
			nota = scanner.nextDouble();
			
			if(nota >= 0 && nota <= 10) {
				somaNotas += nota;
				quantidadeNotas++;
			}else if(nota != -1){
				System.out.println("Nota inválida.");
			}
		}
		
		double media = somaNotas / quantidadeNotas;
		System.out.printf("Média = %.2f | Soma das Notas: %.2f | Quantidade de Notas: %d", media, somaNotas, quantidadeNotas);
		
		scanner.close();
	}
}
