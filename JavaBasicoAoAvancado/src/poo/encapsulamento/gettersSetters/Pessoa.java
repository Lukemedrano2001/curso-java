package poo.encapsulamento.gettersSetters;

public class Pessoa {
	private String nome;
	private int idade;
	
	public Pessoa(String nome, int idade){
		this.setNome(nome);
		this.setIdade(idade);
	}
	
	// Getter: Método válido que retorna o valor da idade da pessoa
	public int getIdade() {
		return this.idade;
	}
	
	// Getter: Método válido que retorna o nome da pessoa
	public String getNome() {
		return this.nome;
	}
	
	// Setter: Método válido que altera o valor da idade da pessoa
	public void setIdade(int novaIdade) {
		if(novaIdade > 0 && novaIdade <= 120) {
			this.idade = novaIdade;
		}
	}
	
	// Setter: Método válido que altera o nome da pessoa
	public void setNome(String novoNome) {
		if(!novoNome.equals(this.getNome())) {
			this.nome = novoNome;
		}
	}
	
	@Override
	public String toString() {
		return String.format("- Nome: %s | Idade: %d", this.getNome(), this.getIdade());
	}
}