package streamAPI.outrosMetodos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import streamAPI.filter.Aluno;

public class Outros {
	public static void main(String[] args) {
		List<Aluno> alunos = Arrays.asList(
				new Aluno("Bia", 7.1),
				new Aluno("Lia", 8.1),
				new Aluno("Ana", 6.1),
				new Aluno("Gui", 10),
				new Aluno("Bia", 7.1),
				new Aluno("Pedro", 9.1),
				new Aluno("Ana", 8.1),
				new Aluno("Maria", 10)
		);
		
		Predicate<Aluno> aprovado = aluno -> aluno.nota >= 7;
		
		
		
		// Distinct -> Tira toda duplicação de objeto, implemente o equals e hashCode
		// O distinct compara os endereços de memória
		System.out.println("Distinct");
		alunos.stream()
			.distinct()
			.forEach(System.out::println);
		
		
		// Skip pula uma quantidade de elementos com base no indice
		// Limit estabelece um limite de elementos
		System.out.println("\nSkip/Limit");
		alunos.stream()
			.distinct()
			.skip(2)
			.limit(2)
			.forEach(System.out::println);
		
		
		// O takeWhile vai ser executa enquanto tiver alunos aprovados
		System.out.println("\ntakeWhile");
		alunos.stream()
			.distinct()
			.takeWhile(aprovado)
			.forEach(System.out::println);
	}
}