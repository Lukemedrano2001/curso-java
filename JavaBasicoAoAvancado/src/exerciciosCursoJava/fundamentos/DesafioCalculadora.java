package exerciciosCursoJava.fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:");
		String valor1 = scanner.next().replace(",", ".");
		double numero1 = Double.parseDouble(valor1);
			
		System.out.println("Digite o segundo número:");
		String valor2 = scanner.next().replace(",", ".");
		double numero2 = Double.parseDouble(valor2);
		
		System.out.println("Digite a operação (+, -, *, /, %): ");
		String operacao = scanner.next();
		
		
		if(operacao.equals("+")) {
			double soma = numero1 + numero2;
			System.out.printf("Soma: %.2f", soma);
		}else if(operacao.equals("-")) {
			double subtracao = numero1 - numero2;
			System.out.printf("Subtração: %.2f", subtracao);
		}else if(operacao.equals("*")) {
			double multiplicacao = numero1 * numero2;
			System.out.printf("Multiplicação: %.2f", multiplicacao);
		}else if(operacao.equals("/")) {
			double divisao = numero1 / numero2;
			System.out.printf("Divisão: %.2f", divisao);
		}else if(operacao.equals("%")) {
			double restoDivisao = numero1 % numero2;
			System.out.printf("Resto da Divisão: %.2f", restoDivisao);
		}else {
			System.out.println("Digite uma operação válida");
		}
		
		
		
		scanner.close();
	}
}
