package br.com.lukemedrano.campoMinado.view;

import org.junit.jupiter.api.BeforeEach;
import br.com.lukemedrano.campoMinado.model.tabuleiro.Tabuleiro;

public class ExecutaJogoTabuleiroConsoleTeste {
	private TabuleiroConsole tabuleiroConsole;
	private Tabuleiro tabuleiro;
	
	@BeforeEach
	void iniciaTabuleiroConsole() {
		tabuleiro = new Tabuleiro(5, 5, 5);
		tabuleiroConsole = new TabuleiroConsole(tabuleiro);
	}
	
	
}