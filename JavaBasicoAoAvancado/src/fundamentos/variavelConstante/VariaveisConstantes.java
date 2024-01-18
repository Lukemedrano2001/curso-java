package fundamentos.variavelConstante;

public class VariaveisConstantes {
	public static void main(String[] args) {
		double raio = 3;
		final double PI = 3.14;
		
		double area = PI * Math.pow(raio, 2);
		
		System.out.printf("Área da Circunferência = %.2f", area);
	}
}
