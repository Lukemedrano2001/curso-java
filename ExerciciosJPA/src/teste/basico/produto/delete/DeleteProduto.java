package teste.basico.produto.delete;

import infraestrutura.daosComHeranca.ProdutoDAO;
import model.basico.Produto;

public class DeleteProduto {
	public static void main(String[] args) {
		ProdutoDAO dao = new ProdutoDAO();
		
		Produto produto = dao.obterUmRegistro("id", 1L);
		System.out.println(produto);
		
		dao.abrirTransacao().remove(produto).fecharTransacao();
		
		dao.fecharDAO();
	}
}
