package poo.heranca.jogo;

public class Heroi extends Jogador {
	// Construtor chamando o Construtor da SuperClasse
	public Heroi(int x, int y) {
		super(x, y);
	}

	// O ataque do heroi é mais forte
	@Override
	public boolean atacar(Jogador oponente) {
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		boolean ataque3 = super.atacar(oponente);
		boolean ataque4 = super.atacar(oponente);
		return ataque1 || ataque2 || ataque3 || ataque4;
	}
	
	@Override
	public String toString() {
		return String.format("X = %d | Y = %d | Vida do Heroi: %d", this.x, this.y, this.vida);
	}
}