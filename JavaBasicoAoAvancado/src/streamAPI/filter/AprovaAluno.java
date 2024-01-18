package streamAPI.filter;

import java.util.function.Function;
import java.util.function.Predicate;

public interface AprovaAluno {
	public static Predicate<Aluno> aprovadoPorNota = aluno -> aluno.nota >= 7;
	public static Predicate<Aluno> bomComportamento = aluno -> aluno.comportamento;
	public static Predicate<Aluno> aprovadoFaltas = aluno -> aluno.numeroFaltas <= 15;
	public static Function<Aluno, String> aprovadoString = aluno ->  String.format(
			"- Aprovado: %s | Nota: %.2f | Faltas: %d | Comportamento: %b", 
			aluno.nome, aluno.nota, aluno.numeroFaltas, aluno.comportamento
	);
}