package streamAPI.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

import streamAPI.filter.Aluno;

public class Reduce2 {
	public static void main(String[] args) {
		List<Aluno> alunos = Arrays.asList(
			new Aluno("Bia", 7.1),
			new Aluno("Lia", 6.1),
			new Aluno("Ana", 8.1),
			new Aluno("Gui", 10)
		);
		
		// Soma apenas as notas dos alunos aprovados
		Predicate<Aluno> aprovado = aluno -> aluno.nota >= 7;
		Function<Aluno, Double> nota = aluno -> aluno.nota;
		BinaryOperator<Double> soma = (num1, num2) -> num1 + num2;
		
		alunos.parallelStream()
			.filter(aprovado)
			.map(nota)
			.reduce(soma)
			.ifPresent(System.out::println);;
	}
}