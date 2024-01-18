package poo.composicaoAndRelacionamentos.oneToMany;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Compra {
	// Composição, Unidirecional (One to Many): Uma compra tem apenas um cliente
	// Composição, Unidirecional (One to Many): Uma compra pode ter muitos pedidos
	// Na maioria das vezes use Unidirecional, para evitar recursão, e ter um melhor desempenho
	
	final int id;
	final String dataCompra;
	final HashMap<Integer, Pedido> pedidos;
	
	Compra(int id, String dataCompra){
		this.id = id;
		this.dataCompra = dataCompra;
		this.pedidos = new HashMap<Integer, Pedido>();
	}
	
	public void adicionaPedido(Pedido pedido) {
		this.pedidos.put(pedido.id, pedido);
	}
	
	public Double calculaTotalCompra(List<Produto> produtos) {
		double totalCompra = 0;
		
		for(Pedido pedido: this.pedidos.values()) {
			totalCompra += pedido.calculaSubTotalPedido(produtos);
		}
		
		return totalCompra;
	}
	
	public String toString(List<Produto> produtos) {
		 String idCompra = "- Id da Compra: " + this.id;
		 String dataCompra = "Data da Compra: " + this.dataCompra;
		 String totalCompra = "Total da Compra: " + this.calculaTotalCompra(produtos);
		 List<Integer> idsPedidos = new ArrayList<Integer>();
		 

		 for (Pedido pedido : this.pedidos.values()) {
		     idsPedidos.add(pedido.id);
		 }
		 
		 String idPedido = "Ids dos Pedidos: " + idsPedidos;
		 
		 return String.format("%s | %s | %s | %s", idCompra, idPedido, dataCompra, totalCompra);
	}
}