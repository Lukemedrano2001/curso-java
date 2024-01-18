package generics.herancaComGenerics.integer;

import generics.comGenerics.Caixa;

public class CaixaInteger extends Caixa<Integer> {
	// Resolvendo o tipo generics com herança
	CaixaInteger(Integer coisa) {
		super(coisa);
	}
}