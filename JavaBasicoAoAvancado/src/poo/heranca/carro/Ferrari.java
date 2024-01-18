package poo.heranca.carro;

public class Ferrari extends Carro{
	public Ferrari(String nome, int velocidade, int VELOCIDADE_MAXIMA) {
		super(nome, velocidade, VELOCIDADE_MAXIMA);
	}
	
	@Override
	public void acelerar() {
		if(this.velocidadeAtual + 15 > this.VELOCIDADE_MAXIMA) {
			super.acelerar();
		}else {
			this.velocidadeAtual += 15;
		}
		
	}
}