package streamAPI.filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Filter {
	public static void main(String[] args) {
		// AprovaAluno e ReprovaAluno são interfaces funcionais que podem ser usadas com os seus métodos static
		// As interfaces não podem ser instanciadas
		
		Consumer<String> println = System.out::println;
		List<Aluno> alunos = Arrays.asList(
			new Aluno("Carlos", 9.7, 0, false),
			new Aluno("Luca", 9.8, 9, false),
			new Aluno("Bia", 5.6, 3, true),
			new Aluno("Gabi", 6.4, 4, true),
			new Aluno("Gui", 4.3, 24, true),
			new Aluno("Maria", 5.2, 20, true),
			new Aluno("Lia", 7.5, 13, true),
			new Aluno("Roberto", 8.9, 6, true)
		);
		
		
		// Alunos só são aprovados se nota >= 7, e comportamento = true, e faltas <= 15
		System.out.println("Aprovados:");
		alunos.stream()
			.filter(AprovaAluno.aprovadoPorNota.and(AprovaAluno.bomComportamento).and(AprovaAluno.aprovadoFaltas))
			.map(AprovaAluno.aprovadoString)
			.forEach(println);
		
		
		// Alunos podem ser reprovaods se nota < 7, ou comportamento = false, ou faltas > 15
		System.out.println("\nReprovados:");
		alunos.stream()
			.filter(ReprovaAluno.reprovadoPorNota.or(ReprovaAluno.malComportamento).or(ReprovaAluno.reprovadoFaltas))
			.map(ReprovaAluno.reprovadoString)
			.forEach(println);
	}
}