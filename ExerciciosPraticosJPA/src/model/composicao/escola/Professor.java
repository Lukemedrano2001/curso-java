package model.composicao.escola;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "professores")
public class Professor extends Pessoa {
	@ManyToMany(mappedBy = "professores", cascade = CascadeType.PERSIST)
	private List<Aluno> alunos = new ArrayList<Aluno>();
	
	public Professor() {}
	
	public Professor(String nome, Endereco endereco) {
		super(nome, endereco);
	}

	public List<Aluno> getAlunos() {
		return this.alunos;
	}

	public void adicionaAluno(Aluno aluno) {
		if (!this.alunos.contains(aluno)) {
			this.alunos.add(aluno);
			aluno.adicionaProfessor(this);
		}else {
			return;
		}
	}
	
	@Override
	public String toString() {
		List<String> alunos = new ArrayList<String>();
		
		for(Aluno aluno: this.getAlunos()) {
			String nomeAluno = aluno.getNome();
			alunos.add(nomeAluno);
		}
		
		return String.format("%s | %s", super.toString(), alunos);
	}
}