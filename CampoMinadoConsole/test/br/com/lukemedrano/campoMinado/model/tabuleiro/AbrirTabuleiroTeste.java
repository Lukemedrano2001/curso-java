package br.com.lukemedrano.campoMinado.model.tabuleiro;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import br.com.lukemedrano.campoMinado.controller.ExplosaoException;


public class AbrirTabuleiroTeste {
	private Tabuleiro tabuleiro;
	
	@BeforeEach
	void iniciaTabuleiro() {
		tabuleiro = new Tabuleiro(5, 5, 5);
	}
	
	@Test
	void testeAbrirTabuleiroCampoNaoMinado() {
		assertTrue(tabuleiro.abrir(3,  3));
	}
	
	@Test
	void testeAbrirTabuleiroCampoMinado() {
		tabuleiro.getCampo(3, 3).minar();
		assertThrows(ExplosaoException.class, () -> { tabuleiro.abrir(3, 3); });
	}
}