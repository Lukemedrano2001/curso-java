package poo.composicaoAndRelacionamentos.manyToMany;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Escola {
	// Composição, Bidirecional 
	// (Many to Many): Um aluno tem muitos cursos, Um curso tem muitos alunos
	// (One to Many): Uma escola tem muitos alunos, Um aluno tem uma escola
	// (One to Many): Uma escola tem muitos cursos, Um curso tem uma escola
	// Lista Constante, mas os elementos dentro dela são variaveis
	
    private HashMap<Integer, Aluno> alunos;
    private HashMap<Integer, Curso> cursos;

    public Escola() {
        this.alunos = new HashMap<Integer, Aluno>();
        this.cursos = new HashMap<Integer, Curso>();
    }

    public void adicionarCurso(Curso curso) {
        this.cursos.put(curso.getId(), curso);
    }
    
    public void adicionarAluno(Aluno aluno) {
    	this.alunos.put(aluno.getId(), aluno);
    }
    
    public void matriculaAlunoNoCurso(int alunoId, int cursoId) {
    	Aluno aluno = alunos.get(alunoId);
    	Curso curso = cursos.get(cursoId);
    	
    	if(aluno != null && curso != null) {
    		aluno.adicionarCurso(curso);
    		curso.adicionarAluno(aluno);
    	}
    }

    public String getDetalhesAlunos() {
        StringBuilder detalhesAlunos = new StringBuilder();

        for (Aluno aluno: alunos.values()) {
            List<String> cursosAlunos = new ArrayList<String>();
            String nomeAluno = "Nome do Aluno: " + aluno.getNome();
            String idAluno = "Id do Aluno: " + aluno.getId();
            
            for (Curso curso : aluno.getCursos().values()) {
                cursosAlunos.add(curso.getNome());
            }
            
            detalhesAlunos.append(String.format("%s | %s | Cursos: %s \n", nomeAluno, idAluno, cursosAlunos));
        }

        return detalhesAlunos.toString();
    }

    public String getDetalhesCursos() {
        StringBuilder detalhes = new StringBuilder();
        
        for (Curso curso: cursos.values()) {
        	String nomeCurso = "\n- Nome do Curso: " + curso.getNome();
        	detalhes.append(nomeCurso).append("\n");
            detalhes.append("   Alunos matriculados:\n");
            
            for (Aluno aluno : curso.getAlunos().values()) {
            	String nomeAluno = "      + Nome do Aluno: " + aluno.getNome();
                detalhes.append(nomeAluno).append("\n");
            }
        }
        
        return detalhes.toString();
    }
}