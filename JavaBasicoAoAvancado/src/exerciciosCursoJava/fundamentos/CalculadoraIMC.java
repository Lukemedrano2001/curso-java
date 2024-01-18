package exerciciosCursoJava.fundamentos;

import java.util.Scanner;

public class CalculadoraIMC {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a sua altura:");
		String valor1 = scanner.next().replace(",", ".");
		double altura = Double.parseDouble(valor1);
		
		System.out.println("Digite o seu peso:");
		String valor2 = scanner.next().replace(",", ".");
		double peso = Double.parseDouble(valor2);
		
		
		double imc = peso / Math.pow(altura, 2);
		
		System.out.printf("IMC: %.4f", imc);
		
		scanner.close();
	}
}
