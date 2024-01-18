package poo.polimorfismo;

public class Comida {
	private String nome;
	private double peso;
	
	protected Comida(String nome, double peso) {
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
	public void setPeso(double novoPeso) {
		if(novoPeso >= 0) {
			this.peso = novoPeso;
		}
	}
	
	@Override
	public String toString() {
		return String.format("- Nome: %s | Peso: %.2f Kg", this.getNome(), this.getPeso());
	}
}