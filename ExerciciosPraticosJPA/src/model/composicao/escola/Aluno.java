package model.composicao.escola;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "alunos")
public class Aluno extends Pessoa {
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(
			name = "alunos_professores", 
			joinColumns = @JoinColumn(name = "aluno_id"), 
			inverseJoinColumns = @JoinColumn(name = "professor_id")
	)
	private List<Professor> professores = new ArrayList<Professor>();
	
	public Aluno() {}
	
	public Aluno(String nome, Endereco endereco) {
		super(nome, endereco);
	}

	public List<Professor> getProfessores() {
		return this.professores;
	}

	public void adicionaProfessor(Professor professor) {
		if (!this.professores.contains(professor)) {
			this.professores.add(professor);
			professor.adicionaAluno(this);
		}else {
			return;
		}
	}
	
	@Override
	public String toString() {
		List<String> professores = new ArrayList<String>();
		
		for(Professor professor: this.getProfessores()) {
			String nomeProfessor = professor.getNome();
			professores.add(nomeProfessor);
		}
		
		return String.format("%s | %s", super.toString(), professores);
	}
}