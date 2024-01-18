package br.com.lukemedrano.campoMinado.model.tabuleiro;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ToStringTabuleiroTeste {
	private Tabuleiro tabuleiro;
	
	@BeforeEach
	void iniciaTabuleiro() {
		tabuleiro = new Tabuleiro(5, 5, 25);
	}
	
	@Test
	void testeToString() {
		String primeiraLinha = "   0  1  2  3  4 \n";
		String segundaLinha = "0  ?  ?  ?  ?  ? \n";
		String terceiraLinha = "1  ?  ?  ?  ?  ? \n";
		String quartaLinha = "2  ?  ?  ?  ?  ? \n";
		String quintaLinha = "3  ?  ?  ?  ?  ? \n";
		String sextaLinha = "4  ?  ?  ?  ?  ? \n";
		
		String retornoEsperado = primeiraLinha + segundaLinha + terceiraLinha + quartaLinha + quintaLinha + sextaLinha;
		String retorno = this.tabuleiro.toString();
		
		assertEquals(retornoEsperado, retorno);
	}
}