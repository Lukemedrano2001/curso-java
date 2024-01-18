package poo.agregacao;

import java.util.ArrayList;
import java.util.List;

public class Turma {
	private List<Aluno> alunos;
	
	Turma(){
		this.alunos = new ArrayList<Aluno>();
	}
	
	// Getter
	public List<Aluno> getAlunos(){
		return this.alunos;
	}
	
	public void adicionaAluno(Aluno aluno) {
		this.alunos.add(aluno);
	}
	
	@Override
	public String toString() {
		StringBuilder resultado = new StringBuilder("Turma:\n");

        for (Aluno aluno: this.alunos) {
            resultado.append(aluno.toString()).append("\n");
        }

        return resultado.toString();
	}
}