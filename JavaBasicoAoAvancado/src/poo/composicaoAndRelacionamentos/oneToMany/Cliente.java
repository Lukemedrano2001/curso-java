package poo.composicaoAndRelacionamentos.oneToMany;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cliente {
	// Composição, Unidirecional (One to Many): Um cliente pode ter muitas compras
	// Na maioria das vezes use Unidirecional, para evitar recursão, e ter um melhor desempenho
	
	final int id;
	final String nome;
	final HashMap<Integer, Compra> compras;
	
	Cliente(int id, String nome){
		this.id = id;
		this.nome = nome;
		this.compras = new HashMap<Integer, Compra>();
	}
	
	public void adicionaCompra(Compra compra) {
		this.compras.put(compra.id, compra);
	}
	
	public Map<Integer, Compra> getCompras(){
		return Collections.unmodifiableMap(compras);
	}
	
	public double calculaTotalCompras(List<Produto> produtos) {
		double totalCompras = 0;

        for (Compra compra: this.compras.values()) {
            totalCompras += compra.calculaTotalCompra(produtos);
        }

        return totalCompras;
	}
	
	// Mude para que o método toString não aceite parâmetros, coloque ele sem parâmetros
	public String toString(List<Produto> produtos) {
		String idCliente = "- Id do Cliente: " + this.id;
		String nomeCliente = "Nome: " + this.nome;
		String compraCliente = "Compras: ";
		String valorTotalCompras = "Valor Total: " + this.calculaTotalCompras(produtos);
		List<Integer> comprasClientes = new ArrayList<Integer>();
		
		for(Compra compra: this.compras.values()) {
			comprasClientes.add(compra.id);
		}
		
		compraCliente += comprasClientes;
		
		return String.format("%s | %s | %s | %s", idCliente, nomeCliente, compraCliente, valorTotalCompras);
	}
}