package teste.basico.produto.select;

import infraestrutura.daosComHeranca.ProdutoDAO;
import model.basico.Produto;

public class ObterProdutoById {
	public static void main(String[] args) {
		ProdutoDAO dao = new ProdutoDAO();
		
		Produto produto = dao.obterUmRegistro("id", 1L);
		System.out.println(produto);
		
		dao.fecharDAO();
	}
}