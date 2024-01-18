package streamAPI.filter;

import java.util.Objects;

public class Aluno {
	public String nome;
	public double nota;
	public int numeroFaltas;
	public boolean comportamento;
	
	public Aluno(String nome, double nota) {
		this.nome = nome;
		this.nota = nota;
	}
	
	public Aluno(String nome, double nota, int numeroFaltas, boolean comportamento) {
		this.nome = nome;
		this.nota = nota;
		this.numeroFaltas = numeroFaltas;
		this.comportamento = comportamento;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(comportamento, nome, nota, numeroFaltas);
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
		return comportamento == other.comportamento && Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota)
				&& numeroFaltas == other.numeroFaltas;
	}

	@Override
	public String toString() {
		return String.format("Nome: %s | Nota: %.2f", this.nome, this.nota);
	}
}