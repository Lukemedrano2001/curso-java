package poo.polimorfismo;

public class Arroz extends Comida{
	private String tipoArroz;
	
	public Arroz(String nome, double peso, String tipoArroz) {
		super(nome, peso);
		this.setTipoArroz(tipoArroz);
	}
	
	// Getter
	public String getTipoArroz() {
		return this.tipoArroz;
	}
	
	// Setter
	public void setTipoArroz(String tipoArroz) {
		this.tipoArroz = tipoArroz;
	}
	
	@Override
	public String toString() {
		String nomeArroz = this.getNome();
		double pesoArroz = this.getPeso();
		String tipoArroz = this.getTipoArroz();
		return String.format("- Nome: %s | Peso: %.2f Kg | Tipo de Arroz: %s", nomeArroz, pesoArroz, tipoArroz);
	}
}