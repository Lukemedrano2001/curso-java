package infraestrutura.daosComHeranca;

import infraestrutura.DAO;
import model.basico.Produto;

public class ProdutoDAO extends DAO<Produto> {
	// Você pode ter métodos alternativos aqui
	
	public ProdutoDAO() {
		super(Produto.class);
	}
}