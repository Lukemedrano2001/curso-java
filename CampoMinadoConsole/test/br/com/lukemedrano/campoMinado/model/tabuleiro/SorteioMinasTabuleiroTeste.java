package br.com.lukemedrano.campoMinado.model.tabuleiro;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import br.com.lukemedrano.campoMinado.model.campo.Campo;

public class SorteioMinasTabuleiroTeste {
	private Tabuleiro tabuleiro;
	
	@BeforeEach
	void iniciaTabuleiro() {
		tabuleiro = new Tabuleiro(5, 5, 5);
	}
	
	@Test
	void testeSorteioMinas() {
		int minas = this.tabuleiro.getMinas();
		
		long quantidadeMinasTabuleiro = this.tabuleiro.getCampos().stream().filter(Campo::isMinado).count();
		assertEquals(quantidadeMinasTabuleiro, minas);
	}
}