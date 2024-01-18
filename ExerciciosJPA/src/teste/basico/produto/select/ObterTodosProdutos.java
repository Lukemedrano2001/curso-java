package teste.basico.produto.select;

import java.util.List;

import infraestrutura.daosComHeranca.ProdutoDAO;
import model.basico.Produto;

public class ObterTodosProdutos {
	public static void main(String[] args) {
		ProdutoDAO dao = new ProdutoDAO();
		List<Produto> produtos = dao.obterTodos();
		
		for(Produto produto: produtos) {
			System.out.println(produto.toString());
		}
		
		double precoTotal = produtos
					.stream()
					.map(produto -> produto.getPreco())
					.reduce(0.0, (preco, total) -> total += preco)
					.doubleValue();
		
		System.out.println("\nPreco Total de todos os produtos sendo somados: " + precoTotal);
		
		dao.fecharDAO();
	}
}