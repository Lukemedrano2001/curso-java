package teste.basico.produto.select;

import java.util.List;

import infraestrutura.daosComHeranca.ProdutoDAO;
import model.basico.Produto;

public class ObterTodosComWhereRelacional {
	public static void main(String[] args) {
		ProdutoDAO dao = new ProdutoDAO();
		
		List<Produto> produtosRelacional = dao.consultar("obterProdutosComFiltroRelacional");     
        for (Produto produto: produtosRelacional) {
            System.out.println(produto.toString());
        }
        
        dao.fecharDAO();
	}
}