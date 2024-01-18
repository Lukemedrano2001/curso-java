package poo.heranca.carro;

import poo.heranca.carro.interfaces.PainelCarro;

public class Carro implements PainelCarro {
	protected String nome;
	protected int velocidadeAtual;
	public final int VELOCIDADE_MAXIMA;		// É uma constante, logo a visibilidade dele não tem problema

	protected Carro(String nome, int velocidade, int velocidadeMaxima) {
		this.nome = nome;
		this.velocidadeAtual = velocidade;
		this.VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	// Implementação do método da interface
	@Override
	public void acelerar() {
		if(this.velocidadeAtual + 5 > this.VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}else {
			this.velocidadeAtual += 5;
		}
	}
	
	// Implementação do método da interface
	@Override
	public void frear() {
		if(this.velocidadeAtual >= 5) {
			this.velocidadeAtual -= 5;
		}else {
			this.velocidadeAtual = 0;
		}
	}
	
	@Override
	public String toString() {
		String nomeCarro = this.nome;
		int velocidadeCarro = this.velocidadeAtual;
		int velocidaMaxima = this.VELOCIDADE_MAXIMA;
		return String.format("Nome: %s | Velocidade: %d Km/h | Velocidade Máxima: %d Km/h", nomeCarro, velocidadeCarro, velocidaMaxima);
	}
}