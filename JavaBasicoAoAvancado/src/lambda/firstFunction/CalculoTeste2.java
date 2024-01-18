package lambda.firstFunction;

public class CalculoTeste2 {
	public static void main(String[] args) {
		// Lambda Function - Soma
		Calculo calculo = (num1, num2) -> { return num1 + num2; };
		System.out.println(calculo.executar(5, 5));
		
		// Lambda Function - Multiplicação
		calculo = (x, y) -> x * y;
		System.out.println(calculo.executar(5, 5));
		
		// Método Default - Subtração Padrão
		System.out.println(calculo.subtracao());
		
		// Método Static - Divisão Static
		System.out.println(Calculo.divisao(10, 5));
	}
}