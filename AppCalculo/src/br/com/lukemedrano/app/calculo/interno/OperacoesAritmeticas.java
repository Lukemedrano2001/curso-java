package br.com.lukemedrano.app.calculo.interno;

import java.util.Arrays;

public class OperacoesAritmeticas {
	// Serviços: Soma, Subtração, Multiplicação, Divisão
	// Pode ter outros métodos:
	// Uma classe concreta não depende de outra de outra classe concreta, ela deve depender de uma interface ou abstração
	
	public double soma1(double... numeros) {
		return Arrays.stream(numeros).reduce(0, (total, atual) -> total + atual);
	}

	public double soma2(double... numeros) {
		double total = 0;
		for(int i = 0; i < numeros.length; i++) {
			total += numeros[i];
		}
		
		return total;
	}
}
