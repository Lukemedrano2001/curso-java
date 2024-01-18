package arraysMatrizes.matriz;

import java.util.Arrays;

public class Matriz {
	// Uma estrutura de dados estática (Tamanho fixo)
	public static void main(String[] args) {
		int[][] numeros = new int[3][3];
		
		numeros[0][0] = 1;
		numeros[0][1] = 2;
		numeros[0][2] = 3;
		
		numeros[1][0] = 4;
		numeros[1][1] = 5;
		numeros[1][2] = 6;
		
		numeros[2][0] = 7;
		numeros[2][1] = 8;
		numeros[2][2] = 9;
		
		for(int[] numero: numeros) {
			System.out.println(Arrays.toString(numero));
		}
	}
}