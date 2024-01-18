package poo.agregacao;

public class Aluno {
	private String nome;
	
	Aluno(String nome){
		this.setNome(nome);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return String.format("- Nome: %s", this.getNome());
	}
}
