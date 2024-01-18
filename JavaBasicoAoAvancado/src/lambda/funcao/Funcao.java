package lambda.funcao;

import java.util.function.Function;

public class Funcao {
	public static void main(String[] args) {
		// A function recebe 2 parametros
		// O primeiro é o parametro que a função espera, o segundo é o return
		
		// Recebe um Integer e retorna uma String
		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Ímpar";
		// Recebe uma String e retorna uma String
		Function<String, String> resultado = valor -> "O resultado é: " + valor;
		// Recebe uma String e retorna uma String
		Function<String, String> empolgado = valor -> valor + "!!!";
		
		String resultadoFinal = parOuImpar.andThen(resultado).andThen(empolgado).apply(32);
		System.out.println(resultadoFinal);
	}
}