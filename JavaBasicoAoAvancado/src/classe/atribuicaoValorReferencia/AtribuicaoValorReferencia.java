package classe.atribuicaoValorReferencia;

public class AtribuicaoValorReferencia {
	int a;
	int b;
	
	AtribuicaoValorReferencia() {
		this.a = 1;
		this.b = 3;
	}
	
	String objetoString() {
		return String.format("a = %d | b = %d", this.a, this.b);
	}
}
