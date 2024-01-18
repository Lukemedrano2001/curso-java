package poo.composicaoAndRelacionamentos.manyToMany;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

public class Curso {
	// Composição, Bidirecional: Um curso pode ter muitos alunos, Um curso pertence somente a uma escola
	
	private final Integer id;
    private final String nome;
    private final HashMap<Integer, Aluno> alunos;

    Curso(Integer id, String nome) {
    	this.id = id;
        this.nome = nome;
        this.alunos = new HashMap<Integer, Aluno>();
    }
    
    @Override
	public int hashCode() {
		return Objects.hash(alunos, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Curso other = (Curso) obj;
		return Objects.equals(alunos, other.alunos) && Objects.equals(nome, other.nome);
	}

	public String getNome() {
        return this.nome;
    }
	
	public Integer getId() {
		return this.id;
	}

    public void adicionarAluno(Aluno aluno) {
        this.alunos.put(aluno.getId(), aluno);
    }

    public Map<Integer, Aluno> getAlunos() {
        return Collections.unmodifiableMap(alunos);
    }

    @Override
    public String toString() {
        return String.format("- Nome do Curso: %s \n", this.nome);
    }
    
    public String getDetalhes() {
    	StringBuilder detalhes = new StringBuilder();
    	detalhes.append(this.toString());
    	detalhes.append("Alunos: \n");
    	
    	for(Entry<Integer, Aluno> aluno: this.alunos.entrySet()) {
    		String chave = "Chave: " + aluno.getKey();
    		String valor = " | Valor: " + aluno.getValue();
    		detalhes.append(chave).append(valor);
    	}
    	
    	return detalhes.toString();
    }
}