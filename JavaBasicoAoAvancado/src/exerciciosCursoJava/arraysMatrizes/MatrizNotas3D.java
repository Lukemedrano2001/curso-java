package exerciciosCursoJava.arraysMatrizes;

import java.util.Arrays;
import java.util.Scanner;

public class MatrizNotas3D {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Input da quantidade de turmas
		System.out.println("Informe a quantidade de turmas:");
		int quantidadeTurmas = scanner.nextInt();
		
		// Input da quantidade de alunos
		System.out.println("Informe a quantidade de alunos:");
		int quantidadeAlunos = scanner.nextInt();
		
		// Input da quantidade de notas por aluno
		System.out.println("Informe a quantidade notas por aluno:");
		int quantidadeNotas = scanner.nextInt();
		double[][][] notasEscola = new double[quantidadeTurmas][quantidadeAlunos][quantidadeNotas];
		
		
		// Loop para digitar as notas até o tamanho que foi estabelecido
		// Cada matriz 2D representa uma turma
		// Cada array dentro da matriz 2D representa as notas de um aluno de uma turma
		int totalNotas = 0;
		for(int i = 0; i < notasEscola.length; i++) {	// O(n)
			for(int j = 0; j < notasEscola[i].length; j++) {	// O(n)
				for(int k = 0; k < notasEscola[i][j].length; k++) {	// O(n)
					System.out.printf("Na turma %d, no aluno %d, informe a nota %d: \n", (i + 1), (j + 1), (k + 1));
					String valor = scanner.next().replace(",", ".").trim();
					double nota = Double.parseDouble(valor);
					
					if(nota >= 0 && nota <= 10) {
						notasEscola[i][j][k] = nota;
						totalNotas++;
					}else {
						System.out.println("Nota inválida. Pulando para o próximo aluno.");
						break;
					}
				}
			}
		}
		
		// Cálculo da soma é feito logo após as notas serem inseridas
		// Precisa de 3 forEach para se ter acesso a cada elemento da matriz
		double somaNotas = 0;
		for(double[][] notasTurma: notasEscola) {	// O(n)
			for(double[] notasAluno: notasTurma) {	// O(n)
				for(double nota: notasAluno) {	// O(n)
					somaNotas += nota;
				}
			}
		}
		
		// Precisa de 1 ForEach para se ter acesso as matrizes 2D
		// Precisa de 1 outro ForEach para se ter acesso aos arrays de cada matriz 2D
		for(double[][] notasTurma: notasEscola) {	// O(n)
			for(double[] notasAluno: notasTurma) {	// O(n)
				System.out.println(Arrays.toString(notasAluno));
			}
		}
		
		
		// Calcula a média e exibe as notas no formato de string
		double mediaNotas = somaNotas / notasEscola.length;

		System.out.printf("Soma: %.2f | Média: %.2f | Total de notas da Escola: %d |", somaNotas, mediaNotas, totalNotas);
		
		scanner.close();
	}
}