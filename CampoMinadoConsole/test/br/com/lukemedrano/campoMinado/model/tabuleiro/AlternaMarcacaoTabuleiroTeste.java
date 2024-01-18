package br.com.lukemedrano.campoMinado.model.tabuleiro;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AlternaMarcacaoTabuleiroTeste {
	private Tabuleiro tabuleiro;
	
	@BeforeEach
	void iniciaTabuleiro() {
		tabuleiro = new Tabuleiro(5, 5, 5);
	}
	
	@Test
	void testeValorPadraoAtributoMarcado() {
		assertFalse(tabuleiro.getCampo(3, 3).isMarcado());
	}
	
	@Test
	void testeAlternaMarcacao() {
		assertTrue(tabuleiro.alternaMarcacao(3, 3));
	}
	
	@Test
	void testeAlternaMarcacaoDuasChamadas() {
		tabuleiro.alternaMarcacao(3, 3);
		tabuleiro.alternaMarcacao(3, 3);
		
		assertFalse(tabuleiro.getCampo(3, 3).isMarcado());
		assertTrue(tabuleiro.getCampo(3, 3).isNaoMarcado());
	}
}