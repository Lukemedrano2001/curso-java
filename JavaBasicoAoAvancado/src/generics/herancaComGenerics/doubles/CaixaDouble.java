package generics.herancaComGenerics.doubles;

import generics.comGenerics.Caixa;

public class CaixaDouble extends Caixa<Double>{
	// Resolvendo o tipo generics com herança
	public CaixaDouble(Double coisa) {
		super(coisa);
	}
}