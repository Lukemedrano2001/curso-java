package br.com.lukemedrano.campoMinado.model.campo;

import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;

public class ReiniciarCampoTeste {
	@Test
	void testeReiniciar() {
		Campo campo = new Campo(3, 3);
		
		campo.abrir();
		campo.minar();
		campo.alternaMarcacao();
		campo.reiniciar();
		
		assertTrue(campo.isFechado() || campo.isNaoMinado() || campo.isNaoMarcado());
	}
}