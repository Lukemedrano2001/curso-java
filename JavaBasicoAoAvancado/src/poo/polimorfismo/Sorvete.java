package poo.polimorfismo;

public class Sorvete extends Comida {
	private String saborSorvete;
	
	public Sorvete(String nome, double peso, String saborSorvete) {
		super(nome, peso);
		this.setSaborSorvete(saborSorvete);
	}
	
	// Getter
	public String getSaborSorvete() {
		return this.saborSorvete;
	}
	
	// Setter
	public void setSaborSorvete(String saborSorvete) {
		this.saborSorvete = saborSorvete;
	}
	
	@Override
	public String toString() {
		String nomeSorvete = this.getNome();
		double pesoSorvete = this.getPeso();
		String saborSorvete = this.getSaborSorvete();
		return String.format("- Nome: %s | Peso: %.2f Kg | Sabor do Sorvete: %s", nomeSorvete, pesoSorvete, saborSorvete);
	}
}