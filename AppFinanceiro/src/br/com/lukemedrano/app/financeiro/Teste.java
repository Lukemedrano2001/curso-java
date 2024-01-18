package br.com.lukemedrano.app.financeiro;

import java.util.ServiceLoader;
import br.com.lukemedrano.app.ICalculadora;

public class Teste {
	public static void main(String[] args) {
		// Agora o teste depende apenas de uma interface e não de implementações
		
		ICalculadora calculadora = ServiceLoader
					.load(ICalculadora.class)
					.findFirst()
					.get();
		
		System.out.println(calculadora.soma1(1, 2, 3, 4, 5, 6, 7, 8, 9));
		
		System.out.println(calculadora.soma2(1, 2, 3, 4, 5));
	}
}