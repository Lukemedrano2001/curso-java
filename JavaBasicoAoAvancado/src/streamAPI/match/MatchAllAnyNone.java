package streamAPI.match;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import streamAPI.filter.Aluno;

public class MatchAllAnyNone {
	public static void main(String[] args) {
		List<Aluno> alunos = Arrays.asList(
				new Aluno("Bia", 7.1),
				new Aluno("Lia", 6.1),
				new Aluno("Ana", 8.1),
				new Aluno("Gui", 10)
		);
		
		Predicate<Aluno> aprovado = aluno -> aluno.nota >= 7;
		Predicate<Aluno> reprovado = aprovado.negate();
		
		boolean turmaAprovada = alunos.stream().allMatch(aprovado);
		boolean algumAluno = alunos.stream().anyMatch(aprovado);
		boolean nenhumAluno = alunos.stream().noneMatch(reprovado);
		
		
		System.out.printf("A turma inteira foi aprovada? %b \n", turmaAprovada);
		System.out.printf("Algum aluno foi aprovado? %b \n", algumAluno);
		System.out.printf("Nenhum aluno foi reprovado? %b", nenhumAluno);
	}
}