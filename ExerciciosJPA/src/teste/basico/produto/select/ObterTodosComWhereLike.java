package teste.basico.produto.select;

import java.util.List;

import infraestrutura.daosComHeranca.ProdutoDAO;
import model.basico.Produto;

public class ObterTodosComWhereLike {
	public static void main(String[] args) {
		ProdutoDAO dao = new ProdutoDAO();
		
		List<Produto> produtosLike = dao.consultar("obterProdutosComFiltroLike");     
        for (Produto produto: produtosLike) {
            System.out.println(produto.toString());
        }
		
		dao.fecharDAO();
	}
}
