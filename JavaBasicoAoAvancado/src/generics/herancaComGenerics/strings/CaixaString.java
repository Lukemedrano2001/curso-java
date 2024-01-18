package generics.herancaComGenerics.strings;

import generics.comGenerics.Caixa;

public class CaixaString extends Caixa<String>{
	// Resolvendo o tipo generics com herança
	public CaixaString(String coisa) {
		super(coisa);
	}
}