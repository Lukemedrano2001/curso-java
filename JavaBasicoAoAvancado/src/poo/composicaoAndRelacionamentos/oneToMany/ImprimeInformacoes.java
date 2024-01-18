package poo.composicaoAndRelacionamentos.oneToMany;

import java.util.List;

public class ImprimeInformacoes {
	public static void imprimirInformacoes(List<Cliente> clientes, Estoque estoque, List<Produto> produtos, List<Pedido> pedidos, List<Compra> compras) {
        System.out.println("Clientes:");
        for(Cliente cliente: clientes) {
        	System.out.println(cliente.toString(produtos));
        }

        System.out.println("\nEstoque:");
        System.out.println(estoque);

        System.out.println("Pedidos:");
        for(Pedido pedido: pedidos) {
        	System.out.println(pedido.toString(produtos));
        }

        System.out.println("\nCompras:");
        for(Compra compra: compras) {
        	System.out.println(compra.toString(produtos));
        }
    }
}
