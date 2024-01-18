package teste.basico.produto.select;


import java.util.List;

import infraestrutura.daosComHeranca.ProdutoDAO;
import model.basico.Produto;


public class ObterTodosComWhereLogico {
	public static void main(String[] args) {
		ProdutoDAO dao = new ProdutoDAO();
		
        List<Produto> produtosLogicos = dao.consultar("obterProdutosComFiltroLogico");

        for (Produto produto: produtosLogicos) {
            System.out.println(produto.toString());
        }

        dao.fecharDAO();
	}
}