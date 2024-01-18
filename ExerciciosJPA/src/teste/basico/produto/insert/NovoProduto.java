package teste.basico.produto.insert;

import infraestrutura.DAO;
import model.basico.Produto;

public class NovoProduto {
	public static void main(String[] args) {		
		Produto produto = new Produto("Televisão", 1500.99);
		
		DAO<Produto> dao = new DAO<Produto>(Produto.class);
		dao.abrirTransacao().incluir(produto).fecharTransacao().fecharDAO();
		
		System.out.println("Id gerado: " + produto.getId());
	}
}