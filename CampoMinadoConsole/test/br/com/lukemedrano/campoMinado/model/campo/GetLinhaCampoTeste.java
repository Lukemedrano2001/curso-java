package br.com.lukemedrano.campoMinado.model.campo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class GetLinhaCampoTeste {
	
	@Test
	void testeGetLinha() {
		Campo campo = new Campo(2, 3);
		
		int linhaEsperada = 2;
		int linhaRetornada = campo.getLinha();
		assertEquals(linhaEsperada, linhaRetornada);
	}
}