package exerciciosCursoJava.fundamentos;

public class FahrenheintCelsius {
	public static void main(String[] args) {
		double fahrenheint = 212;
		final int numero1 = 32;
		final double numero2 = 5 / 9.0;
		
		double celsius = (fahrenheint - numero1)  * (numero2);
		
		System.out.printf("Fahrenheint = %.2f | Celsius = %.2f", celsius, fahrenheint);
	}
}