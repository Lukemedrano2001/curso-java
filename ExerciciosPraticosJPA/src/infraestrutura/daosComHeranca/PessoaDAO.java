package infraestrutura.daosComHeranca;

import infraestrutura.DAO;
import model.unidirecional.empresa.Pessoa;

public class PessoaDAO extends DAO<Pessoa> {
	public PessoaDAO() {
		super(Pessoa.class);
	}
}