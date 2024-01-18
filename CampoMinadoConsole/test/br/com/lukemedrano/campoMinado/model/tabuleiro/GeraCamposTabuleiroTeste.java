package br.com.lukemedrano.campoMinado.model.tabuleiro;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeraCamposTabuleiroTeste {
	private Tabuleiro tabuleiro;
	
	@BeforeEach
	void iniciaTabuleiro() {
		tabuleiro = new Tabuleiro(5, 5, 5);
	}
	
	@Test
	void testeGeraCampos() {
		int camposEsperados = 25;
		int camposReais = this.tabuleiro.getCampos().size();
		
		assertEquals(camposEsperados, camposReais);
	}
}