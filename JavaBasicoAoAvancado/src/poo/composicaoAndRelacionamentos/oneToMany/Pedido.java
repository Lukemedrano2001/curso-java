package poo.composicaoAndRelacionamentos.oneToMany;

import java.util.List;

public class Pedido {
	// Composição, Unidirecional (One to Many): Um pedido tem apenas um produto
	// Na maioria das vezes use Unidirecional, para evitar recursão, e ter um melhor desempenho
	
	final int id;
	final int quantidade;
	final int idProduto;
	
	Pedido(int id, int quantidade, int idProduto){
		this.id = id;
		this.quantidade = quantidade;
		this.idProduto = idProduto;
	}
	
	public Double calculaSubTotalPedido(List<Produto> produtos) {
		Produto produtoCorrespondente = null;
        for (Produto produto: produtos) {
            if (produto.id == this.idProduto) {
                produtoCorrespondente = produto;
                break;
            }
        }
        
        if (produtoCorrespondente != null) {
            return this.quantidade * produtoCorrespondente.preco;
        } else {
            return 0.0; // Produto não encontrado
        }
	}
	
	public String toString(List<Produto> produtos) {
		String idPedido = "- Id do Pedido: " + this.id;
		String idProduto = "Id do Produto: " + this.idProduto;
		String quantidadePedido = "Quantidade: " + this.quantidade;
		String subTotal = "SubTotal do Pedido: " + this.calculaSubTotalPedido(produtos);
		
		return String.format("%s | %s | %s | %s", idPedido, idProduto, quantidadePedido, subTotal);
	}
}