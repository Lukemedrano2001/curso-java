package lambda.biFunctions;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctions1 {
	public static void main(String[] args) {
		// Recebe 2 parametros e retorna algum outro tipo de retorno
		
		// Calcula a média
		BiFunction<Double, Double, Double> media = (num1, num2) -> (num1 + num2) / 2;
		// Retorna se foi ou não aprovado com base na nota minima
		Function<Double, String> resultado = valor -> valor >= 7 ? "Aprovado" : "Reprovado";
		
		System.out.println(media.andThen(resultado).apply(5.0, 5.0));
	}
}