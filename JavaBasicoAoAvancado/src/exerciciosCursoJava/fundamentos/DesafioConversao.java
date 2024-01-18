package exerciciosCursoJava.fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o seu nome:");
		String nome = scanner.nextLine();
		
		System.out.printf("Olá %s, vamos calcular a média dos últimos três salários que você recebeu:", nome);
		
		System.out.println("\nDigite o primeiro salário:");
		String valor1 = scanner.next().replace(",", ".");
		double salario1 = Double.parseDouble(valor1);
		
		System.out.println("Digite o segundo salário:");
		String valor2 = scanner.next().replace(",", ".");
		double salario2 = Double.parseDouble(valor2);
		
		System.out.println("Digite o terceiro salário:");
		String valor3 = scanner.next().replace(",", ".");
		double salario3 = Double.parseDouble(valor3);
		
		double somaSalarial = salario1 + salario2 + salario3;
		double mediaSalarial = somaSalarial / 3;
		
		System.out.printf("\nSalario 1: %.2f | Salario 2: %.2f | Salario 3: %.2f \n", salario1, salario2, salario3);
		System.out.printf("Soma Salarial: %.2f | Média Salarial: %.2f", somaSalarial, mediaSalarial);
		
		scanner.close();
	}
}