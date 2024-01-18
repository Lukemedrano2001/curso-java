package exerciciosCursoJava.arraysMatrizes;

import java.util.Arrays;
import java.util.Scanner;

public class MatrizNotas2D {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Input da quantidade de alunos
		System.out.println("Informe a quantidade de alunos:");
		int quantidadeAlunos = scanner.nextInt();
		
		// Input da quantidade de notas por aluno
		System.out.println("Informe a quantidade notas por aluno:");
		int quantidadeNotas = scanner.nextInt();
		double[][] notasTurma = new double[quantidadeAlunos][quantidadeNotas];
		
		
		// Loop para digitar as notas até o tamanho que foi estabelecido, cada array dentro da matriz, representa um aluno
		int totalNotas = 0;
		for(int i = 0; i < notasTurma.length; i++) {	// O(n)
			for(int j = 0; j < notasTurma[i].length; j++) {	// O(n)
				System.out.printf("Informe a nota %d, do aluno %d: \n", (j + 1), (i + 1));
				String valor = scanner.next().replace(",", ".").trim();
				double nota = Double.parseDouble(valor);
				
				if(nota >= 0 && nota <= 10) {
					notasTurma[i][j] = nota;
					totalNotas++;
				}else {
					System.out.println("Nota inválida. Pulando para o próximo aluno.");
					break;
				}
			}
		}
		
		
		// Cálculo da soma é feito logo após as notas serem inseridas
		// Precisa de 2 forEach para se ter acesso a cada elemento da matriz
		double somaNotas = 0;
		for(double[] notaAluno: notasTurma) {	// O(n)
			for(double nota: notaAluno) {	// O(n)
				somaNotas += nota;
			}
		}
		
		// ForEach para cada array dentro da matriz
		for(double[] notasAluno: notasTurma) {	// O(n)
			System.out.println(Arrays.toString(notasAluno));
		}
		
		
		// Calcula a média e exibe as notas no formato de string
		double mediaNotas = somaNotas / notasTurma.length;
		
		System.out.printf("Soma: %.2f | Média: %.2f | Total de notas da Turma: %d |", somaNotas, mediaNotas, totalNotas);
		
		scanner.close();
	}
}