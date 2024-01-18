package lambda.operadorBinario;

import java.util.function.BinaryOperator;

public class OperadorBinario {
	public static void main(String[] args) {
		// Recebe 2 parâmetros do mesmo tipo e deve retornar o mesmo tipo dos parâmetros
		
		BinaryOperator<Double> media = (num1, num2) -> (num1 + num2) / 2; 
		
		
		System.out.println(media.apply(10.0, 5.0));
	}
}