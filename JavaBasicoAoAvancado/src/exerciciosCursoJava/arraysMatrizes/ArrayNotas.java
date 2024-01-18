package exerciciosCursoJava.arraysMatrizes;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayNotas {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Input da quantidade de notas
		System.out.println("Informe a quantidade notas:");
		int quantidadeNotas = scanner.nextInt();
		double[] notasAlunos = new double[quantidadeNotas]; 
		
		// Loop para digitar as notas até o tamanho que foi estabelecido
		for(int i = 0; i < notasAlunos.length; i++) {	// O(n)
			System.out.printf("Informe a nota %d: \n", (i + 1));
			String valor = scanner.next().replace(",", ".").trim();
			double nota = Double.parseDouble(valor);
			
			if(nota >= 0 && nota <= 10) {
				notasAlunos[i] = nota;
			}else {
				System.out.println("Nota inválida.");
				break;
			}
		}
		
		// Cálculo da soma é feito quando todas as notas foram inseridas
		double somaNotas = 0;
		for(double notaAluno: notasAlunos) {	// O(n)
			somaNotas += notaAluno;
		}
		
		// Calcula a média e exibe as notas no formato de string
		double mediaNotas = somaNotas / notasAlunos.length;
		String notasString = Arrays.toString(notasAlunos);
		
		System.out.printf("Soma: %.2f | Média: %.2f | Notas: %s", somaNotas, mediaNotas, notasString);
		
		scanner.close();
	}
}
