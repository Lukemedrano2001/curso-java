package operadores;

public class OperadoresAritmeticos {
	public static void main(String[] args) {
		// 6 * 5 = 30 e 30^2 = 900
		double numerador1 = Math.pow(6 * (3 + 2), 2);
		
		// 3 * 2 = 6
		int denominador1 = 3 * 2;
		
		// 900 / 6 = 150
		double expressao1 = numerador1 / denominador1;
		
		// -4 * -5 / 2 = 10 e 10^2 = 100
		int denominador2 = 2;
		double expressao2 = Math.pow( (1 - 5) * (2 - 7) / denominador2, 2);
		
		// 150 - 100 = 50
		double numerador3 = Math.pow(expressao1 - expressao2, 3);
		
		// 10^3 = 1.000
		double denominador3 = Math.pow(10, 3);
		
		// 125.000 / 1.000 = 125
		double resultado = numerador3 / denominador3;
		
		
		System.out.println(resultado);
	}
}
