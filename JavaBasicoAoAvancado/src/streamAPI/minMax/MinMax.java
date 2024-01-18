package streamAPI.minMax;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import streamAPI.filter.Aluno;

public class MinMax {
	public static void main(String[] args) {
		List<Aluno> alunos = Arrays.asList(
				new Aluno("Bia", 7.1),
				new Aluno("Lia", 6.1),
				new Aluno("Ana", 8.1),
				new Aluno("Gui", 10)
		);
		
		Comparator<Aluno> melhorNota = (aluno1, aluno2) -> { 
			if(aluno1.nota > aluno2.nota) return 1;
			if(aluno1.nota < aluno2.nota) return -1;
			return 0;
		};
		
		Comparator<Aluno> piorNota = (aluno1, aluno2) -> { 
			if(aluno1.nota > aluno2.nota) return -1;
			if(aluno1.nota < aluno2.nota) return 1;
			return 0;
		};
		
		// Máxima Melhor Nota
		// Máxima Pior Nota
		System.out.println(alunos.stream().max(melhorNota).get());
		System.out.println(alunos.stream().min(piorNota).get());
		
		// Mínima Melhor Nota
		// Mínima Pior Nota
		System.out.println(alunos.stream().min(melhorNota).get());
		System.out.println(alunos.stream().max(piorNota).get());
	}
}