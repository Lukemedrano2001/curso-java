package poo.composicaoAndRelacionamentos.manyToMany;

public class EscolaTeste {
	public static void main(String[] args) {
		Escola escola1 = new Escola();
		
		
		// Inserção de alunos
		for(int i = 1; i <= 6; i++) {
			Aluno aluno = new Aluno(i, "Aluno " + i);
			escola1.adicionarAluno(aluno);
		}
		
		
		// Inserção de cursos
		for(int j = 1; j <= 6; j++) {
			Curso curso = new Curso(j, "Curso " + j);
			escola1.adicionarCurso(curso);
		}
		
		
		// Matriculas dos alunos em seus respectivos
		for(int k = 1; k <= 6; k++) {
			int cursoId = k;
			int proximoCursoId = (k % 6) + 1;
			escola1.matriculaAlunoNoCurso(k, cursoId);
			escola1.matriculaAlunoNoCurso(k, proximoCursoId);
		}
		
		
		// Alunos e Cursos associados a escola
        System.out.println("Detalhes da Escola:\n");
        System.out.println("1-) Alunos na escola:\n" + escola1.getDetalhesAlunos());
        System.out.println("2-) Cursos na escola:" + escola1.getDetalhesCursos());
	}
}
