package br.com.lukemedrano.campoMinado.model.campo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AlternaMarcacaoCampoTeste {
	private Campo campo;
	
	@BeforeEach
	void iniciaCampo() {
		campo = new Campo(3, 3);
	}
	
	@Test
	void testeValorPadraoAtributoMarcado() {
		assertTrue(campo.isNaoMarcado());
	}
	
	@Test
	void testeAlternaMarcacao() {
		campo.alternaMarcacao();
		assertTrue(campo.isMarcado());
	}
	
	@Test
	void testeAlternaMarcacaoDuasChamadas() {
		campo.alternaMarcacao();
		campo.alternaMarcacao();		
		
		assertFalse(campo.isMarcado());
		assertTrue(campo.isNaoMarcado());
	}
}