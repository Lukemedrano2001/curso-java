package teste.basico.produto.select;

import java.util.List;

import infraestrutura.daosComHeranca.ProdutoDAO;
import model.basico.Produto;

public class ObterTodosComFiltroDinamico {
	public static void main(String[] args) {
		ProdutoDAO dao = new ProdutoDAO();
		List<Produto> produtosDinamicos = dao.consultar("obterProdutosComFiltroDinamico");

        for (Produto produto: produtosDinamicos) {
            System.out.println(produto);
        }

        dao.fecharDAO();
	}
}