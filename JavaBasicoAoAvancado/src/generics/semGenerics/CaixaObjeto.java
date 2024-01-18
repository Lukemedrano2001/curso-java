package generics.semGenerics;

public class CaixaObjeto {
	private Object coisa;

	CaixaObjeto(Object coisa){
		this.guardarCoisa(coisa);
	}
	
	// Getter
	public Object abrirCaixa() {
		return this.coisa;
	}

	// Setter
	public void guardarCoisa(Object coisa) {
		this.coisa = coisa;
	}
}