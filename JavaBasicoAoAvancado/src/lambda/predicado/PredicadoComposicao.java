package lambda.predicado;

import java.util.function.Predicate;

public class PredicadoComposicao {
	public static void main(String[] args) {
		// Composição de funções com predicate, sempre recebe um parametro e retorna um boolean
		// Retorna se é ou não par
		Predicate<Integer> isPar = num -> num % 2 == 0; 
		// Retorna se o número está entre 100 e 999
		Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;
		
		System.out.println(isPar.and(isTresDigitos).test(3));
		System.out.println(isPar.and(isTresDigitos).negate().test(3));
		System.out.println(isPar.or(isTresDigitos).test(101));
	}
}
