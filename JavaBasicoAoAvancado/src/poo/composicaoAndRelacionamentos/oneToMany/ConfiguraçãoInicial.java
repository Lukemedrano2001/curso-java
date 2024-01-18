package poo.composicaoAndRelacionamentos.oneToMany;

import java.util.List;

public class ConfiguraçãoInicial {
	public static void adicionaProdutosNoEstoque(Estoque estoque, List<Produto> produtos) {
        for(int i = 0; i < produtos.size(); i++) {
        	Produto produto = produtos.get(i);
        	estoque.adicionaProduto(produto.id, produto);
        }
	}
	
	public static void configuraPedidos(List<Pedido> pedidos, List<Produto> produtos) {
		for (int i = 0; i < pedidos.size(); i++) {
        	Pedido pedido = pedidos.get(i);
            Produto produto = produtos.get(i % produtos.size());
            produto.adicionaPedido(pedido);
        }
	}
	
	public static void configuraCompras(List<Compra> compras, List<Cliente> clientes) {
		for(int i = 0; i < compras.size(); i++) {
        	Compra compra = compras.get(i);
            Cliente cliente = clientes.get(i % clientes.size());
            cliente.adicionaCompra(compra);
        }
	}
	
	public static void adicionaCompraAosPedidos(List<Compra> compras, List<Pedido> pedidos) {
		for(int i = 0; i < pedidos.size(); i++) {
        	Compra compra = compras.get(i % compras.size());
        	Pedido pedido = pedidos.get(i);
        	compra.adicionaPedido(pedido);
        }
	}
	
	public static void adicionaCompraAosClientes(List<Compra> compras, List<Cliente> clientes) {
        for(int i = 0; i < compras.size(); i++) {
        	Compra compra = compras.get(i);
            Cliente cliente = clientes.get(i % clientes.size());
            cliente.adicionaCompra(compra);
        }
	}
}
