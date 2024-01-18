package exerciciosCursoJava.fundamentos;

import java.util.Scanner;

public class AreaTriangulo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor da base:");
		String valor1 = scanner.next().replace(",", ".");
		double base = Double.parseDouble(valor1);
		
		
		System.out.println("Digite o valor da altura:");
		String valor2 = scanner.next().replace(",", ".");
		double altura = Double.parseDouble(valor2);
		
		
		double area = (base * altura) / 2;
		
		System.out.printf("Base: %.2f | Altura: %.2f | Área: %.2f", base, altura, area);
		
		
		
		scanner.close();
	}
}
