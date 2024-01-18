package lambda.predicado;

import java.util.function.Predicate;

public class Predicado1 {
	public static void main(String[] args) {
		// Sempre recebe um parametro e retorna um boolean
		// Se for false é barato
		// Se for true é caro
		Predicate<Produto> isCaro = 
				produto -> produto.preco * (1 - produto.desconto) >= 10;
		
		Produto produto1 = new Produto("Caneta", 1, 0.15);
		System.out.println("Produto é caro? " + isCaro.test(produto1));
	}
}