package br.com.lukemedrano.campoMinado.model.tabuleiro;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ValidaCoordenadasTabuleiroTeste {
private Tabuleiro tabuleiro;
	
	@BeforeEach
	void iniciaTabuleiro() {
		tabuleiro = new Tabuleiro(5, 5, 5);
	}
	
	@Test
	void testeValidaCoordenadasDentroDoLimite() {
		assertTrue(this.tabuleiro.validaCoordenadas(3, 3));
	}
	
	@Test
	void testeValidaCoordenadasForaDoLimite() {
		assertThrows(IllegalArgumentException.class, () -> { this.tabuleiro.validaCoordenadas(5, 5); });
	}
}