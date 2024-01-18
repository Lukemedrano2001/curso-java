package generics.comGenerics;

public class Caixa<TIPO> {
	// Quando a classe é instancia, ela pode ter diversos tipos, pode ser String, Double, Integer
	// Ela é uma classe genérica e suporta diversos tipos mais especificos.
	
	private TIPO coisa;

	public Caixa(TIPO coisa){
		this.guardarCoisa(coisa);
	}
	
	// Getter
	public TIPO abrirCaixa() {
		return this.coisa;
	}

	// Setter
	public void guardarCoisa(TIPO coisa) {
		this.coisa = coisa;
	}
}