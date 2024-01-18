package exerciciosCursoJava.fundamentos;

public class CelsiusFahrenheint {
	public static void main(String[] args) {
		double celsius = 30;
		final int numero1 = 32;
		final double numero2 = 9 / 5.0;
		
		double fahrenheint = (celsius * numero2) + numero1;
		
		System.out.printf("Celsius: %.2f | Fahrenheint: %.2f", celsius, fahrenheint);
	}
}
