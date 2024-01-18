package lambda.operadorBinario;

import java.util.function.Function;
import lambda.predicado.Produto;

public class Desafio {
	public static void main(String[] args) {
		/*
		 	1. Preço com desconto: preco * (1 - desconto)
		 	2. Imposto: preco >= 2500, então preco * 1.085, se não preco
		 	3. Frete: preco >= 3000, então preco + 100, se não preco + 50
			4. Formatação do Preço final: Duas casas decimais
		*/
		
		
		Produto produto1 = new Produto("Ipad", 3235.89, 0.50);
		
		
		Function<Produto, Double> precoComDesconto = produto -> produto.preco * (1 - produto.desconto);
		Function<Double, Double> imposto = preco -> preco >= 2500 ? preco * 1.085 : preco;
		Function<Double, Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
		Function<Double, String> formatar = preco -> String.format("Preço Final: R$ %.2f", preco);
 		
		
		System.out.println(produto1.toString());
		String preco = precoComDesconto
				.andThen(imposto)
				.andThen(frete)
				.andThen(formatar)
				.apply(produto1);
		
		System.out.println(preco);
	}
}