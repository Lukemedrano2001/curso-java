package fundamentos.conversaoTipos;

import javax.swing.JOptionPane;

public class ConversaoTiposPrimitivos {
	public static void main(String[] args) {
		// Nem toda string pode ser convertida em um tipo numérico, mas todo tipo numérico pode ser convertido em uma string
		
		// Números
		int numero1 = Integer.parseInt("1000");
		double numero2 = Double.parseDouble("1.2345678");
		
		// String
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro número:");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo número:");
		
		double numero3 = Double.parseDouble(valor1);
		double numero4 = Double.parseDouble(valor2);
		double somaString = numero3 + numero4;
		
		System.out.println("Número 1: " + numero1);
		System.out.println("Número 2: " + numero2);
		System.out.println("Soma de Número 1 e Número 2 é: " + somaString);
		
		System.out.println("Tamanho do Número 1: " + Integer.toString(numero1).length());
		System.out.println("Tamanho do Número 2: " + Double.toString(numero2).length());
	}
}