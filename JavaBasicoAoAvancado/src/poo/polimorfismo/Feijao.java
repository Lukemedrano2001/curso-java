package poo.polimorfismo;

public class Feijao extends Comida {
	private String tipoFeijao;
	
	public Feijao(String nome, double peso, String tipoFeijao){
		super(nome, peso);
		this.setTipoFeijao(tipoFeijao);
	}
	
	// Getter
	public String getTipoFeijao() {
		return this.tipoFeijao;
	}
	
	// Setter
	public void setTipoFeijao(String tipoFeijao) {
		this.tipoFeijao = tipoFeijao;
	}
	
	@Override
	public String toString() {
		String nomeFeijao = this.getNome();
		double pesoFeijao = this.getPeso();
		String tipoFeijao = this.getTipoFeijao();
		return String.format("- Nome: %s | Peso: %.2f Kg | Tipo de Feijão: %s", nomeFeijao, pesoFeijao, tipoFeijao);
	}
}