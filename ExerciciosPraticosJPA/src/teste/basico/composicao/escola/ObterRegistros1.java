package teste.basico.composicao.escola;

import java.util.List;

import infraestrutura.daosComHeranca.AlunoDAO;
import model.composicao.escola.Aluno;

public class ObterRegistros1 {
	public static void main(String[] args) {
		AlunoDAO dao = new AlunoDAO();
		
		List<Aluno> alunos = dao.obterTodos();
		
		for(Aluno aluno: alunos) {
			System.out.println(aluno.toString());
		}
		
		dao.fecharDAO();
	}
}