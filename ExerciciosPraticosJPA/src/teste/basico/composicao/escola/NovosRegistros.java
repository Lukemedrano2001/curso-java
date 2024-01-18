package teste.basico.composicao.escola;

import infraestrutura.daosComHeranca.AlunoDAO;
import infraestrutura.daosComHeranca.ProfessorDAO;
import model.composicao.escola.Aluno;
import model.composicao.escola.Endereco;
import model.composicao.escola.Professor;

public class NovosRegistros {
	public static void main(String[] args) {
		AlunoDAO daoAluno = new AlunoDAO();
		ProfessorDAO daoProfessor = new ProfessorDAO();
		
		Endereco endereco1 = new Endereco("Rua 1", "Complemento 1");
		Endereco endereco2 = new Endereco("Rua 2", "Complemento 2");
		
		Aluno aluno1 = new Aluno("João", endereco1);
		Aluno aluno2 = new Aluno("Maria", endereco1);
		
		Professor professor1 = new Professor("Roberto", endereco2);
		Professor professor2 = new Professor("Bia", endereco2);
		
		aluno1.adicionaProfessor(professor1);
		aluno1.adicionaProfessor(professor2);
		
		professor2.adicionaAluno(aluno1);
		professor2.adicionaAluno(aluno2);
		
		daoAluno.abrirTransacao()
			.incluir(aluno1)
			.incluir(aluno2)
			.fecharTransacao();
		
		daoProfessor.abrirTransacao()
			.incluir(professor1)
			.incluir(professor2)
			.fecharTransacao();
		
		daoAluno.fecharDAO();
	}
}