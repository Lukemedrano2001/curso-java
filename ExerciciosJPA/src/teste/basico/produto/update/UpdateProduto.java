package teste.basico.produto.update;

import infraestrutura.daosComHeranca.ProdutoDAO;
import model.basico.Produto;

public class UpdateProduto {
	public static void main(String[] args) {
		ProdutoDAO dao = new ProdutoDAO();
		
		Produto produto = dao.obterUmRegistro("id", 2L);
		produto.setNome("Teste Atualização");
		System.out.println(produto);
		
		dao.abrirTransacao().atualizar(produto).fecharTransacao();
		
		dao.fecharDAO();
	}
}