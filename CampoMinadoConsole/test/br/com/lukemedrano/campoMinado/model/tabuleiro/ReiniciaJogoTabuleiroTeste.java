package br.com.lukemedrano.campoMinado.model.tabuleiro;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class ReiniciaJogoTabuleiroTeste {
	private Tabuleiro tabuleiro;
	
	@Test
	void testeReiniciaJogoTabuleiroSemMina() {
		// Teste verificando se todos os campos não estão abertos e nem marcados, após reiniciar o jogo
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
		this.tabuleiro.reiniciaJogo();
		assertTrue(this.tabuleiro.objetivoNaoAlcancado());
		
		boolean camposFechados = this.tabuleiro.getCampos().stream().allMatch(campo -> campo.isFechado());
		boolean camposNaoMarcados = this.tabuleiro.getCampos().stream().allMatch(campo -> campo.isNaoMarcado());
		
		assertTrue(camposFechados);
		assertTrue(camposNaoMarcados);
	}
	
	@Test
	void testeReiniciaJogoTabuleiroMinado() {
		// Teste verificando se todos os campos foram minados, após reiniciar o jogo
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
		this.tabuleiro.reiniciaJogo();
		assertTrue(this.tabuleiro.objetivoNaoAlcancado());
		
		boolean camposMinados = this.tabuleiro.getCampos().stream().allMatch(campo -> campo.isMinado());
		assertTrue(camposMinados);
	}
}