package poo.heranca.teste;

import poo.heranca.jogo.Heroi;
import poo.heranca.jogo.JogadorAcoes;
import poo.heranca.jogo.Monstro;

public class Jogo {
	public static void main(String[] args) {		
		Heroi heroi1 = new Heroi(10, 10);
		Monstro monstro1 = new Monstro(10, 11);
		
		for(int i = 0; i < 2; i++) {
			JogadorAcoes.atacaImprime(heroi1, monstro1);
		}
		
		for(int i = 0; i < 2; i++) {
			JogadorAcoes.moveAleatoriamente(heroi1, monstro1);			
		}
	}
}