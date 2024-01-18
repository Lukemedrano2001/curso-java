package br.com.lukemedrano.campoMinado;

import br.com.lukemedrano.campoMinado.model.tabuleiro.Tabuleiro;
import br.com.lukemedrano.campoMinado.view.TabuleiroConsole;

public class Aplicacao {
	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro(5, 5, 5);
		new TabuleiroConsole(tabuleiro);
	}
}