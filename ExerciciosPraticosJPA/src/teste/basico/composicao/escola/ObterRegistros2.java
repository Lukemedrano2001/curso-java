package teste.basico.composicao.escola;

import java.util.List;

import infraestrutura.daosComHeranca.ProfessorDAO;
import model.composicao.escola.Professor;

public class ObterRegistros2 {
	public static void main(String[] args) {
		ProfessorDAO dao = new ProfessorDAO();
		
		List<Professor> professores = dao.obterTodos();
		
		for(Professor professor: professores) {
			System.out.println(professor);
		}
		
		dao.fecharDAO();
	}
}