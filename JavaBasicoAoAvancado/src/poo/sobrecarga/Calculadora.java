package poo.sobrecarga;

public class Calculadora {
	// Soma de 2 inteiros
	public String somar(int numero1, int numero2) {
		int resultado = numero1 + numero2;
		String texto = "Soma de 2 inteiros: \n";
		
		return String.format("%s| %d + %d = %d | \n", texto, numero1, numero2, resultado);
	}
	
	// Soma de 2 doubles
	public String somar(double numero1, double numero2) {
		double resultado = numero1 + numero2;
		String texto = "Soma de 2 doubles: \n";
		
		return String.format("%s| %.2f + %.2f = %.2f | \n", texto,  numero1, numero2, resultado);
	}
	
	// Soma de 3 inteiros
	public String somar(int numero1, int numero2, int numero3) {
		int resultado = numero1 + numero2 + numero3;
		String texto = "Soma de 3 inteiros: \n";
		
		return String.format("%s| %d + %d + %d = %d | \n", texto, numero1, numero2, numero3, resultado);
	}
	
	// Soma de 3 doubles
	public String somar(double numero1, double numero2, double numero3) {
		double resultado = numero1 + numero2 + numero3;
		String texto = "Soma de 3 doubles: \n";
		
		return String.format("%s| %.2f + %.2f + %.2f = %.2f | \n", texto, numero1, numero2, numero3, resultado);
	}
}