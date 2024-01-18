package streamAPI.map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	public static void main(String[] args) {
		/*
			1. Converta o número para uma string binária	
			2. Inverter a string binária "110" para "011"
			3. Converta a string "011" para um número	
		*/
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Consumer<Integer> println = System.out::println;
		
		// Números: 1, 2, 3, 4, 5, 6, 7, 8, 9
		// String Binária: 1, 10, 11, 100, 101, 110, 111, 1000, 1001
		Function<Integer, String> stringBinaria = numero -> Integer.toBinaryString(numero);
		// String Binária Invertida: 1, 01, 11, 001, 101, 111, 0001, 1001
		UnaryOperator<String> inverteString = string -> new StringBuilder(string).reverse().toString();
		// Números: 1, 1, 3, 1, 5, 3, 7, 1, 9 
		Function<String, Integer> binarioParaInteger = string -> Integer.parseInt(string, 2);
		
		
		numeros.stream()
			.map(stringBinaria)
			.map(inverteString)
			.map(binarioParaInteger)
			.forEach(println);
	}
}