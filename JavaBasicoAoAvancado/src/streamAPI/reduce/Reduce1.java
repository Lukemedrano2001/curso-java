package streamAPI.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		BinaryOperator<Integer> soma = (acumulador, numero) -> acumulador + numero;
		
		// 45 -> Retorna um Optional<Integer>, pois não tem um valor inicial
		Integer total1 = numeros.parallelStream().reduce(soma).get();
		System.out.println(total1);
		
		// 145 -> Retorna um Integer, pois tem um valor inicial
		Integer total2 = numeros.stream().reduce(100, soma);
		System.out.println(total2);
		
		// 30 -> Retorna um Optional<Integer>, pois não tem um valor inicial
		numeros.stream()
			.filter(n -> n > 5)
			.reduce(soma)
			.ifPresent(System.out::println);;
	}
}