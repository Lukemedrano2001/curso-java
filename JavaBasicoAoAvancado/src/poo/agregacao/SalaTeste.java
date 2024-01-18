package poo.agregacao;

import java.util.Arrays;
import java.util.List;

public class SalaTeste {
	public static void main(String[] args) {
		Turma turma1 = new Turma();
		
		
		// Lista de instancias dos alunos 
		List<Aluno> alunos = Arrays.asList(
			new Aluno("Roberto"),
			new Aluno("Carlos"),
			new Aluno("Maria")
		);
		
		
		// Adicionando alunos na turma
		for(Aluno aluno: alunos) {
			turma1.adicionaAluno(aluno);
		}
		
		
		System.out.println(turma1.toString());
	}
}