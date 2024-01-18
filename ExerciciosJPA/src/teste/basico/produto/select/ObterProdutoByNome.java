package teste.basico.produto.select;

import infraestrutura.daosComHeranca.ProdutoDAO;
import model.basico.Produto;

public class ObterProdutoByNome {
	public static void main(String[] args) {
		ProdutoDAO dao = new ProdutoDAO();
		
		Produto produto = dao.obterUmRegistro("nome", "Geladeira");
		System.out.println(produto);
		
		dao.fecharDAO();
	}
}
