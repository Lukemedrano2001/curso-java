package poo.composicaoAndRelacionamentos.oneToMany;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Produto {
	// Composição, Unidirecional (One to Many): Um produto pode ter uma lista de pedidos
	// Composição, Unidirecional (One to Many): Um produto tem apenas um estoque
	// Na maioria das vezes use Unidirecional, para evitar recursão, e ter um melhor desempenho
	
	final int id;
	final String nome;
	final int quantidade;
	final double preco;
	final HashMap<Integer, Pedido> pedidos;
	
	Produto(int id, String nome, double preco, int quantidade){
		this.id = id;
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
		this.pedidos = new HashMap<Integer, Pedido>();
	}

	public void adicionaPedido(Pedido pedido) {
		this.pedidos.put(pedido.id, pedido);
	}
	
	@Override
	public String toString() {
		String idProduto = "- Id do Produto: " + this.id;
		String nomeProduto = " | Nome: " + this.nome;
		String precoProduto = " | Preço: " + this.preco;
		String quantidadeProduto = " | Quantidade: " + this.quantidade;
		String precoTotal = " | Preço Total: " + this.preco * this.quantidade;
		List<Integer> idsPedidos = new ArrayList<Integer>();
		
		 for (Pedido pedido : this.pedidos.values()) {
		     idsPedidos.add(pedido.id);
		 }
		 
		 String idPedido = " | Ids dos Pedidos: " + idsPedidos;
		
		String detalhes = idProduto + nomeProduto + precoProduto + quantidadeProduto + precoTotal + idPedido;
		return String.format("%s", detalhes);
	}
}