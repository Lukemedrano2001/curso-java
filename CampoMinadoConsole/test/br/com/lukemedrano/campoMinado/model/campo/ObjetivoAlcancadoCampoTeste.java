package br.com.lukemedrano.campoMinado.model.campo;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class ObjetivoAlcancadoCampoTeste {
	@Test
	void testeObjetivoAlcancado() {
		Campo campo1 = new Campo(3, 3);
		Campo campo2 = new Campo(2, 4);
		
		campo1.abrir();
		campo2.minar();
		campo2.alternaMarcacao();
		
		assertTrue(campo1.objetivoAlcancado() || campo2.objetivoAlcancado());
	}
}