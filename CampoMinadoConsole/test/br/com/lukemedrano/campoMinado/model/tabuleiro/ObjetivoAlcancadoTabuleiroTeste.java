package br.com.lukemedrano.campoMinado.model.tabuleiro;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class ObjetivoAlcancadoTabuleiroTeste {
	private Tabuleiro tabuleiro;
	
	@Test
	void testeObjetivoAlcancadoTabuleiroSemMina() {
		// Teste se o objetivo é alcançado, se abrir todas os campos sem mina do tabuleiro
		tabuleiro = new Tabuleiro(5, 5, 0);
		int linhas = this.tabuleiro.getLinhas();
		int colunas = this.tabuleiro.getColunas();
		
		assertTrue(this.tabuleiro.objetivoNaoAlcancado());
		
		for(int linha = 0; linha < linhas; linha++) {
			for(int coluna = 0; coluna < colunas; coluna++) {
				this.tabuleiro.abrir(linha, coluna);
			}
		}
		
		assertTrue(this.tabuleiro.objetivoAlcancado());
	}
	
	@Test
	void testeObjetivoAlcancadoTabuleiroCheioDeMina() {
		// Teste se o objetivo é alcançado, se marcar todas as minas do tabuleiro
		tabuleiro = new Tabuleiro(5, 5, 25);
		int linhas = this.tabuleiro.getLinhas();
		int colunas = this.tabuleiro.getColunas();
		
		assertTrue(this.tabuleiro.objetivoNaoAlcancado());
		
		for(int linha = 0; linha < linhas; linha++) {
			for(int coluna = 0; coluna < colunas; coluna++) {
				this.tabuleiro.alternaMarcacao(linha, coluna);
			}
		}
		
		assertTrue(this.tabuleiro.objetivoAlcancado());
	}
}