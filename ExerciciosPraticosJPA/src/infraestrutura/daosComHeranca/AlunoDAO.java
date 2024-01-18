package infraestrutura.daosComHeranca;

import infraestrutura.DAO;
import model.composicao.escola.Aluno;

public class AlunoDAO extends DAO<Aluno> {
	public AlunoDAO() {
		super(Aluno.class);
	}
}