package streamAPI.filter;

import java.util.function.Function;
import java.util.function.Predicate;

public interface ReprovaAluno {
	public static Predicate<Aluno> reprovadoPorNota = aluno -> aluno.nota < 7;
	public static Predicate<Aluno> malComportamento = aluno -> !aluno.comportamento;
	public static Predicate<Aluno> reprovadoFaltas = aluno -> aluno.numeroFaltas > 15;
	public static Function<Aluno, String> reprovadoString = aluno ->  String.format(
			"- Reprovado: %s | Nota: %.2f | Faltas: %d | Comportamento: %b", 
			aluno.nome, aluno.nota, aluno.numeroFaltas, aluno.comportamento
	);
}