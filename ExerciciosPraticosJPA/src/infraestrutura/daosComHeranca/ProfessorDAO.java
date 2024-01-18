package infraestrutura.daosComHeranca;

import infraestrutura.DAO;
import model.composicao.escola.Professor;

public class ProfessorDAO extends DAO<Professor> {
	public ProfessorDAO() {
		super(Professor.class);
	}
}