package generics.metodosComGenerics;

import generics.comGenerics.Caixa;

public class CaixaNumeros<Numero extends Number> extends Caixa<Numero>{
	// Number: SuperClasse de Byte, Short, Integer, Long, Float, Double
	public CaixaNumeros(Numero coisa) {
		super(coisa);
	}
}