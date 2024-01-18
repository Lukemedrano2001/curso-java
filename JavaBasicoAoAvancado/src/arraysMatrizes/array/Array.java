package arraysMatrizes.array;

import java.util.Arrays;

public class Array {
	// Uma estrutura de dados estática (Tamanho fixo)
	public static void main(String[] args) {
		double[] notasAlunos = new double[4];
		
		System.out.println(Arrays.toString(notasAlunos));
		
		notasAlunos[0] = 7.9;
		notasAlunos[1] = 8;
		notasAlunos[2] = 6.7;
		notasAlunos[3] = 9.7;
		
		System.out.println(Arrays.toString(notasAlunos));
		
		double somaNotas = 0;
		for(int i = 0; i < notasAlunos.length; i++) {
			somaNotas += notasAlunos[i];
		}
		
		double media = somaNotas / notasAlunos.length;
		
		System.out.printf("Média: %.2f \n\n", media);
		
		
		double[] numeros = { 6.9, 8.9, 5.5, 10 };
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}
}
