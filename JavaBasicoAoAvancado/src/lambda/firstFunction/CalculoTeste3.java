package lambda.firstFunction;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	public static void main(String[] args) {
		// Lambda Function - Soma
		BinaryOperator<Double> calculo = (num1, num2) -> { return num1 + num2; };
		System.out.println(calculo.apply(5.0, 5.0));
		
		// Lambda Function - Multiplicação
		calculo = (x, y) -> x * y;
		System.out.println(calculo.apply(5.0, 5.0));
	}
}