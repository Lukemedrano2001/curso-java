package poo.abstracao;

public abstract class Animal {
	// Classe abstrata, não permite instanciação de objetos
	// Classe abstrata pode ter alguns métodos com implementação e outros abstratos
	
	private String nome;
	private double peso;
	
	Animal(String nome, double peso){
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
	
	// Método abstrato, os animais fazem barulhos diferentes, este aqui não tem implementação na classe atual
	public abstract String fazerBarulho();
	
	// Metodo comer usa do método setter, este aqui tem implementação na classe atual
	public void comer(double pesoComida) {
		if(pesoComida >= 0) {
			this.setPeso(pesoComida);
		}
	}
	
	@Override
	public String toString() {
		return String.format("Nome: %s | Peso: %.2f Kg", this.getNome(), this.getPeso());
	}
}