package streamAPI.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

import streamAPI.filter.Aluno;

public class Reduce3 {
	public static void main(String[] args) {
		List<Aluno> alunos = Arrays.asList(
				new Aluno("Bia", 7.1),
				new Aluno("Lia", 6.1),
				new Aluno("Ana", 8.1),
				new Aluno("Gui", 10)
		);
		
		
		// Soma apenas as notas dos alunos aprovados
		Predicate<Aluno> aprovado = aluno -> aluno.nota >= 7;
		Function<Aluno, Double> notaAluno = aluno -> aluno.nota;
		BiFunction<Media, Double, Media> calculaMedia = (media, nota) -> media.adiciona(nota);
		BinaryOperator<Media> combinaMedia = (media1, media2) -> Media.combinaMedia(media1, media2);
		
		
		Media mediaAprovados = alunos.stream()
						.filter(aprovado)
						.map(notaAluno)
						.reduce(new Media(), calculaMedia, combinaMedia);
		
		
		System.out.println(mediaAprovados.getValor());
	}
}