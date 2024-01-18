package infraestrutura.daosComHeranca;

import infraestrutura.DAO;
import model.unidirecional.empresa.Funcionario;

public class FuncionarioDAO extends DAO<Funcionario> {
	public FuncionarioDAO(){
		super(Funcionario.class);
	}
}