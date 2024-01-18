package poo.polimorfismo;

public class Pessoa {
	private String nome;
	private double peso;
	
	protected Pessoa(String nome, double peso) {
		this.setNome(nome);
		this.setPeso(peso);
	}
	
	// Getter
	public String getNome() {
		return this.nome;
	}
	
	// Setter
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	// Getter
	public double getPeso() {
		return this.peso;
	}
	
	// Setter
	public void setPeso(double pesoAdicional) {
		if(pesoAdicional >= 0) {
			this.peso += pesoAdicional;
		}
	}
	
	// O metodo comer usa dos metodos getters e setters da classe Comida e da Classe Pessoa
	// Polimorfismo Dinâmico
	public void comer(Comida comida) {
		double comidaPeso = comida.getPeso();
		if(comidaPeso >= 0) {
			this.setPeso(comidaPeso);			
		}
	}
	
	@Override
	public String toString() {
		String nomePessoa = this.getNome();
		double pesoPessoa = this.getPeso();
		return String.format("- Nome: %s | Peso: %.2f Kg", nomePessoa, pesoPessoa);
	}
}