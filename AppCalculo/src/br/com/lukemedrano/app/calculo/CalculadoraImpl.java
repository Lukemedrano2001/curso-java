package br.com.lukemedrano.app.calculo;

import br.com.lukemedrano.app.ICalculadora;
import br.com.lukemedrano.app.calculo.interno.OperacoesAritmeticas;
import br.com.lukemedrano.app.logging.Logger;

public class CalculadoraImpl implements ICalculadora {
	private OperacoesAritmeticas operacoesAritmeticas = new OperacoesAritmeticas();

	public double soma1(double... numeros) {
		Logger.informacoes("Soma:");
		return operacoesAritmeticas.soma1(numeros);
	}
	
	@Override
	public double soma2(double... numeros) {
		return operacoesAritmeticas.soma2(numeros);
	}
	
	public Class<Logger> getLoggerClass(){
		return Logger.class;
	}
}
