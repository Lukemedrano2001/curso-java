package br.com.lukemedrano.campoMinado.view;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import br.com.lukemedrano.campoMinado.controller.EncerrarJogoException;
import br.com.lukemedrano.campoMinado.controller.ExplosaoException;
import br.com.lukemedrano.campoMinado.model.tabuleiro.Tabuleiro;

public class TabuleiroConsole {
	private Tabuleiro tabuleiro;
	private Scanner scanner = new Scanner(System.in);
	
	public TabuleiroConsole(Tabuleiro tabuleiro){
		this.tabuleiro = tabuleiro;
		this.executaJogo();
	}

	// Logo abaixo, os métodos são de visibilidade pacote ou default
	
	void fechaScanner() {
		scanner.close();
	}
	
	void executaJogo() {
		try {
			boolean continuar = true;
			
			while(continuar) {
				this.fluxoNormalJogo();
				
				System.out.println("Jogar de novo? (y / n)");
				String resposta = scanner.nextLine();
				
				if("n".equalsIgnoreCase(resposta)) {
					continuar = false;
				}else {
					tabuleiro.reiniciaJogo();
				}
			}
		}catch(EncerrarJogoException excecao) {
			System.out.println("Jogo encerrado!!!");
		}finally {
			this.fechaScanner();
		}
	}

	void fluxoNormalJogo() {
		try {
			while(!tabuleiro.objetivoAlcancado()) {
				System.out.println(tabuleiro.toString());
				String valorDigitado = this.capturaValorDigitado("Digite (x, y): ");
				
				Iterator<Integer> xy = Arrays.stream(valorDigitado.split(","))
						.map(elemento -> Integer.parseInt(elemento.trim())).iterator();
				
				valorDigitado = this.capturaValorDigitado("1 - Abrir ou 2 - (Des)Marcar:");
				
				if("1".equals(valorDigitado)) {
					tabuleiro.abrir(xy.next(), xy.next());
				}else if("2".equals(valorDigitado)){
					tabuleiro.alternaMarcacao(xy.next(), xy.next());
				}
			}
			
			System.out.println(tabuleiro.toString());
			System.out.println("Você ganhou!!!");
		}catch(ExplosaoException excecao) {
			System.out.println(tabuleiro.toString());
			System.out.println("Você perdeu!!!");
		}
	}
	
	String capturaValorDigitado(String texto) {
		System.out.println(texto);
		String valorDigitado = scanner.nextLine();
		
		if("sair".equalsIgnoreCase(valorDigitado)) {
			throw new EncerrarJogoException();
		}
		
		return valorDigitado;
	}
}