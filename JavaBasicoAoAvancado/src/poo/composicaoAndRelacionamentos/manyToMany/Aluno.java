package poo.composicaoAndRelacionamentos.manyToMany;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;


public class Aluno {
	// Composição, Bidirecional: Um aluno pode ter muitos cursos
	
	private final Integer id;
    private final String nome;
    private final HashMap<Integer, Curso> cursos;
   
    Aluno(Integer id, String nome) {
    	this.id = id;
        this.nome = nome;
        this.cursos = new HashMap<Integer, Curso>();
    }

    @Override
	public int hashCode() {
		return Objects.hash(cursos, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Aluno other = (Aluno) obj;
		return Objects.equals(cursos, other.cursos) && Objects.equals(nome, other.nome);
	}

	public String getNome() {
        return this.nome;
    }
	
	public Integer getId() {
		return this.id;
	}

    public void adicionarCurso(Curso curso) {
        this.cursos.put(curso.getId(), curso);
    }

    public Map<Integer, Curso> getCursos() {
        return Collections.unmodifiableMap(cursos);
    }

    @Override
    public String toString() {
        return String.format("- Nome do Aluno: %s \n", this.nome);
    }
    
    public String getDetalhes() {
    	StringBuilder detalhes = new StringBuilder();
    	
        for (Entry<Integer, Curso> curso: cursos.entrySet()) {
            String chave = "Chave: " + curso.getKey();
            String valor = "| Valor: " + curso.getValue();
            detalhes.append(chave).append(valor).append(false).append("\n");
        }
        
        return detalhes.toString();
    }
}