package br.com.lukemedrano.campoMinado.model.campo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class GetColunaCampoTeste {
	@Test
	void testeGetColuna() {
		Campo campo = new Campo(3, 2);
		
		int colunaEsperada = 2;
		int colunaRetornada = campo.getColuna();
		assertEquals(colunaEsperada, colunaRetornada);
	}
}