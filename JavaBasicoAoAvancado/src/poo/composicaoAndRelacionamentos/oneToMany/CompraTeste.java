package poo.composicaoAndRelacionamentos.oneToMany;

import java.util.Arrays;
import java.util.List;

public class CompraTeste {
    public static void main(String[] args) {
    	
    	// Criando o estoque
        Estoque estoque1 = new Estoque();
        
    	// Criando os clientes
    	List<Cliente> clientes = Arrays.asList(
    			new Cliente(1, "João"),
    			new Cliente(2, "Carlos")
    	);     
        
        // Criando os compras
        List<Compra> compras = Arrays.asList(
        	new Compra(1, "2023-01-01"),
        	new Compra(2, "2023-02-01"),
        	new Compra(3, "2023-03-01"),
        	new Compra(4, "2023-04-01")
        );
        
        // Criando os produtos
        List<Produto> produtos = Arrays.asList(
                new Produto(1, "Produto 1", 5.0, 100),
                new Produto(2, "Produto 2", 10.0, 200),
                new Produto(3, "Produto 3", 15.0, 300),
                new Produto(4, "Produto 4", 20.0, 400)
        );
        
        // Criando os pedidos
        List<Pedido> pedidos = Arrays.asList(
                new Pedido(1, 5, 1),
                new Pedido(2, 10, 2),
                new Pedido(3, 15, 3),
                new Pedido(4, 20, 4),
                new Pedido(5, 25, 4),
                new Pedido(6, 30, 3),
                new Pedido(7, 35, 2),
                new Pedido(8, 40, 1)
        );
        
        // Adicionando produtos no estoque
        ConfiguraçãoInicial.adicionaProdutosNoEstoque(estoque1, produtos);
        
        
        // Configurando cada pedido com seu determinado produto
        // Configurando os produtos e seus pedidos correspondentes
        ConfiguraçãoInicial.configuraPedidos(pedidos, produtos);

        
        // Configurando cada compra com determinado cliente
        ConfiguraçãoInicial.configuraCompras(compras, clientes);
        
        
        // Adicionando as compras aos pedidos
        ConfiguraçãoInicial.adicionaCompraAosPedidos(compras, pedidos);
        
        
        // Adicionando as compras aos clientes
        ConfiguraçãoInicial.adicionaCompraAosClientes(compras, clientes);
        
        
        // Impressão de tudo no console
        ImprimeInformacoes.imprimirInformacoes(clientes, estoque1, produtos, pedidos, compras);
    }
}