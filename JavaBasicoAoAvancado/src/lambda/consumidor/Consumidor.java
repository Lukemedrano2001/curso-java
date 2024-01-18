package lambda.consumidor;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import lambda.predicado.Produto;

public class Consumidor {
	public static void main(String[] args) {
		// O consumer recebe 1 parâmetro e não retorna nada, no exemplo ele imprime direto no console
		
		Consumer<Produto> imprimir = produto -> System.out.println(produto.nome); 
		
		// 1 Produto 
		Produto produto1 = new Produto("Caneta", 1.99, 0.15);
		imprimir.accept(produto1);
		
		// Lista de Produtos
		List<Produto> produtos = Arrays.asList(
			new Produto("Caneta", 1.99, 0.15),
			new Produto("Caderno", 2.99, 0.25),
			new Produto("Borracha", 3.99, 0.35)
		);
		
		// Recebe 1 consumer
		produtos.forEach(imprimir);
	}
}
